/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box;

import java.io.ByteArrayInputStream;

import org.mule.modules.box.exception.BoxException;
import org.mule.modules.box.exception.ErrorList;
import org.mule.modules.box.exception.Error;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class JerseyUtils {

	
	public static <T> T secureDelete(WebResource.Builder resource, Class<T> entityClass, String apiKey, String authToken) {
		return delete(secure(resource, apiKey, authToken), entityClass);
	}
	
	public static <T> T delete(WebResource.Builder resource, Class<T> entityClass) {
		return execute(resource, entityClass, "DELETE", 200, 204);
	}
	
	public static <T> T securePost(WebResource.Builder resource, Class<T> entityClass, String apiKey, String authToken) {
		return post(secure(resource, apiKey, authToken), entityClass);
	}
	
	public static <T> T post(WebResource.Builder resource, Class<T> entityClass) {
		return execute(resource, entityClass, "POST", 200, 201);
	}
	
	public static <T> T put(WebResource.Builder resource, Class<T> entityClass) {
		return execute(resource, entityClass, "PUT", 200, 201);
	}
	
	public static <T> T securePut(WebResource.Builder resource, Class<T> entityClass, String apiKey, String authToken) {
		return put(secure(resource, apiKey, authToken), entityClass);
	}
	
	public static <T> T secureGet(WebResource.Builder resource, Class<T> entityClass, String apiKey, String authToken) {
		return get(secure(resource, apiKey, authToken), entityClass);
	}
	
	public static <T> T get(WebResource.Builder resource, Class<T> entityClass) {
		return execute(resource, entityClass, "GET", 200);
	}
	
	private static WebResource.Builder secure(WebResource.Builder resource, String apiKey, String authToken) {
		return resource.header("Authorization", String.format("BoxAuth api_key=%s&auth_token=%s", apiKey, authToken));
	}
	
    private static <T> T execute(WebResource.Builder resource, Class<T> entityClass, String method, int... expectedStatus) {
    	ClientResponse response = resource.method(method, ClientResponse.class);
		int status = response.getStatus();
		 
		if (contains(expectedStatus, status)) {
			return status != 204 ? response.getEntity(entityClass) : null;
		 } else {
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
    }
    
    private static <T> T parseError(String json, ClientResponse response, Class<T> clazz) {
    	response.setEntityInputStream(new ByteArrayInputStream(json.getBytes()));
    	return response.getEntity(clazz);
    }
    
    private static boolean contains(int[] expected, int obtained) {
    	for (int i : expected) {
    		if (i == obtained) {
    			return true;
    		}
    	}
    	return false;
    }
	
}
