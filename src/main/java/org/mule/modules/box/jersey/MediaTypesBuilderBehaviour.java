/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.jersey;

import javax.ws.rs.core.MediaType;

import org.mule.commons.jersey.RequestBehaviour;
import org.mule.modules.box.model.response.UploadFileResponse;

import com.sun.jersey.api.client.WebResource.Builder;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class MediaTypesBuilderBehaviour implements RequestBehaviour {
	
	public static final MediaTypesBuilderBehaviour INSTANCE = new MediaTypesBuilderBehaviour();
	
	private MediaTypesBuilderBehaviour() {}
	
	@Override
	public <T> Builder behave(Builder builder, String method, Class<T> entityClass) {
		if (UploadFileResponse.class.isAssignableFrom(entityClass)) {
			return builder;
		} else {
			return builder.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON);
		}
		
	};

}
