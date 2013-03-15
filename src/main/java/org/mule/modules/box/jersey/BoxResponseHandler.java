/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.jersey;

import java.io.ByteArrayInputStream;

import org.mule.commons.jersey.DefaultResponseHandler;
import org.mule.modules.box.exception.BoxException;
import org.mule.modules.box.exception.Error;
import org.mule.modules.box.exception.ErrorList;

import com.sun.jersey.api.client.ClientResponse;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class BoxResponseHandler extends DefaultResponseHandler {

	public static final BoxResponseHandler INSTANCE = new BoxResponseHandler();
	
	private BoxResponseHandler() {}
	
	@Override
	public <T> T onFailure(ClientResponse response, int status, int[] expectedStatus) {
		String json = response.getEntity(String.class);
		 
		 try {
			 ErrorList list = parseError(json, response, ErrorList.class);
			 throw new BoxException(String.format("was expecting status code %d but got %d. Response was %s", expectedStatus, status, json), list);
		 } catch (Exception e) {
			 Error error = null;
			 try {
				  error = parseError(json, response, Error.class);
			 } catch (Exception e2) {
				 throw new RuntimeException(String.format("Got error with status %d but could not parse this: %s", status, json), e2);
			 }

			 throw new BoxException(json, error, e);
		 }

	}
	
	private <T> T parseError(String json, ClientResponse response, Class<T> clazz) {
    	response.setEntityInputStream(new ByteArrayInputStream(json.getBytes()));
    	return response.getEntity(clazz);
    }

}
