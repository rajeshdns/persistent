/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.jersey.json;

import org.mule.modules.box.model.Event;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public abstract class GsonFactory {

	private final static Gson instance = new GsonBuilder()
									.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
									.registerTypeAdapter(Event.class, new EventDeserializer())
									.create();
	
	private final static Gson raw = new GsonBuilder()
									.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
									.create();
	
	public static Gson get() {
		return instance;
	}
	
	public static Gson getRawInstance() {
		return raw;
	}
}
