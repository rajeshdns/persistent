/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class JerseyUtils {

	public static <T> T secureGet(WebResource.Builder resource, Class<T> entityClass, String apiKey, String authToken) {
		return get(secure(resource, apiKey, authToken), entityClass);
	}
	
	public static <T> T get(WebResource.Builder resource, Class<T> entityClass) {
		return execute(resource, entityClass, "GET", 200);
	}
	
	private static WebResource.Builder secure(WebResource.Builder resource, String apiKey, String authToken) {
		return resource.header("Authorization", String.format("BoxAuth api_key=%s&auth_token=%s", apiKey, authToken));
	}
	
    private static <T> T execute(WebResource.Builder resource, Class<T> entityClass, String method, int expectedStatus) {
    	ClientResponse response = resource.method(method, ClientResponse.class);
		int status = response.getStatus();
		 
		if (status == expectedStatus) {
			 return response.getEntity(entityClass);
		 } else {
			 throw new RuntimeException(String.format("got status %d for resource at %s", status, response.getLocation().toString()));
		 }
    }
	
}
