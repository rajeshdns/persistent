/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */


package org.mule.modules.boxnet.callback;

import java.util.Map;

import org.mule.api.MessagingException;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.callback.HttpCallback;
import org.mule.api.processor.MessageProcessor;
import org.mule.config.i18n.MessageFactory;
import org.mule.modules.boxnet.BoxNetModule;


/**
 * @author MuleSoft, Inc.
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class AuthCallbackAdapter extends HttpCallbackAdapter {

	private MuleContext muleContext;
	private BoxNetModule module;
	private HttpCallback callback;

	private String ticket;
	private String authToken;
    
    private class GetAuthCodeCallback implements MessageProcessor {

        public MuleEvent process(MuleEvent event) throws MuleException {
            try {
            	Map<String, String> values = HttpParamsExtractor.toMap(event.getMessage());
            	module.saveAuthToken(event.getMessage(), values.get("auth_token"));
            } catch (Exception e) {
                throw new MessagingException(MessageFactory.createStaticMessage("Could not extract auth token"), event, e);
            }
            return event;
        }
    }
    
    public AuthCallbackAdapter(MuleContext muleContext, BoxNetModule module) {
		assert muleContext != null : "Mule context cannot be null";
		
    	this.muleContext = muleContext;
		this.module = module;
	}

	/**
     * Retrieves redirectUrl
     * 
     */
    public String getRedirectUrl() {
        return "https://www.box.net/api/1.0/auth/" + this.ticket;
    }

    public void start() throws MuleException {
    	this.init();
    	callback = new DefaultHttpCallback(new AuthCallbackAdapter.GetAuthCodeCallback(), muleContext, getDomain(), getLocalPort(), getRemotePort(), this.module.getCallbackPath(), getAsync());
        callback.start();
    }

    public void stop() throws MuleException {
        callback.stop();
    }

	public String getTicket() {
		return ticket;
	}
	
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getAuthToken() {
		return authToken;
	}
	
	public void setAuthToken(String token) {
		this.authToken = token;
	}
    
}
