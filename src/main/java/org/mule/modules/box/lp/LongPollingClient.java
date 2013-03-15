/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.lp;

import org.apache.log4j.Logger;
import org.mule.api.callback.SourceCallback;
import org.mule.commons.jersey.JerseyUtil;
import org.mule.modules.box.model.PollingEvent;

import com.sun.jersey.api.client.ClientResponse.Status;
import com.sun.jersey.api.client.WebResource;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class LongPollingClient {
	
	private static final Logger logger = Logger.getLogger(LongPollingClient.class);
	
	private JerseyUtil jerseyUtil;
	private WebResource pollingResource;
	private boolean subscribed = true;
	
	public LongPollingClient(WebResource pollingResource, JerseyUtil jerseyUtil) {
		this.pollingResource = pollingResource;
		this.jerseyUtil = jerseyUtil;
	}
	
	
	public synchronized void subscribe(final SourceCallback callback) {
		Runnable listener = new Runnable() {
			
			@Override
			public void run() {
				while (subscribed) {
					try {
						PollingEvent event = jerseyUtil.get(pollingResource,
															PollingEvent.class,
															Status.OK.getStatusCode(),
															Status.NO_CONTENT.getStatusCode(),
															Status.GATEWAY_TIMEOUT.getStatusCode(),
															Status.REQUEST_TIMEOUT.getStatusCode());
						
						if (event.isNewEvent()) {
							
							if (logger.isDebugEnabled()) {
								logger.debug(String.format("Received polling event from %s... Yielding to source callback", pollingResource));
							}
							
							try {
								callback.process(event);
							} catch (Exception e) {
								logger.error(String.format("Exception found processing new long polling event for resource %s. Will reconnect anyway", pollingResource), e);
							}
						} else if (event.isReconnect()) {
							if (logger.isDebugEnabled()) {
								logger.debug(String.format("Received reconnect message from polling endpoint %s", pollingResource));
							}
						} else {
							if (logger.isDebugEnabled()) {
								if (logger.isDebugEnabled()) {
									logger.debug(String.format("Received unknown message from polling endpoint %s. Message is: %s. Will reconnect anyway", pollingResource, event.getMessage()));
								}
							}
						}
					} catch (Throwable t) {
						logger.error(String.format("Found exception while long-polling on resource %s: %s. Will try to reconnect anyway", pollingResource, t.getMessage()));
					}
				}
			}
		};
		
		new Thread(listener, "Box Long Polling thread for endpont " + this.pollingResource).start();
	}
	
	public synchronized void unsubscribe() {
		this.subscribed = false;
	}
	
}
