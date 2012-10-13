/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */


package org.mule.modules.boxnet.callback;

import java.util.Map;

import org.mule.DefaultMuleEvent;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.callback.HttpCallback;
import org.mule.api.processor.MessageProcessor;
import org.mule.modules.boxnet.BoxConnector;


/**
 * @author MuleSoft, Inc.
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class AuthCallbackAdapter extends HttpCallbackAdapter {

	private MuleContext muleContext;
	private BoxConnector connector;
	private HttpCallback callback;

	private String ticket;
	
    
    private class GetAuthCodeCallback implements MessageProcessor {

    	public MuleEvent process(MuleEvent event) throws MuleException {
        	MuleMessage message = event.getMessage();
    		Map<String, String> values = HttpParamsExtractor.toMap(message);
    		
    		MuleMessage response = connector.saveAuthToken(message, values.get("ticket"), values.get("auth_token"));

            return new DefaultMuleEvent(response, event);
        }
    }
    
    public AuthCallbackAdapter(MuleContext muleContext, BoxConnector module) {
		assert muleContext != null : "Mule context cannot be null";
		
    	this.muleContext = muleContext;
		this.connector = module;
	}

    public void start() throws MuleException {
    	this.init();
    	callback = new DefaultHttpCallback(new AuthCallbackAdapter.GetAuthCodeCallback(), muleContext, getDomain(), getLocalPort(), getRemotePort(), this.connector.getCallbackPath(), getAsync(), this.connector.getHttpConnector());
        callback.start();
    }

    public void stop() throws MuleException {
        callback.stop();
    }

	public String getTicket() {
		return ticket;
	}
    
}
