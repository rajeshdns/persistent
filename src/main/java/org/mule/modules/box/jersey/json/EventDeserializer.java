/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.jersey.json;

import java.lang.reflect.Type;

import org.mule.modules.box.model.Event;
import org.mule.modules.box.model.File;
import org.mule.modules.box.model.Folder;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class EventDeserializer implements JsonDeserializer<Event> {
	
	@Override
	public Event deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		JsonObject event = json.getAsJsonObject();
		JsonElement source = event.get("source");
		
		Event result = GsonFactory.getRawInstance().fromJson(event, Event.class);
		
		if (source != null && source.isJsonObject()) {
			this.maybeEnrichSource(result, source);
		}
		
		return result;
	}
	
	private void maybeEnrichSource(Event event, JsonElement source) {
		JsonObject sourceObject = source.getAsJsonObject();
		JsonElement typeElement = sourceObject.get("type");
		
		if (typeElement != null) {
			String type = typeElement.getAsString();
			
			if ("file".equals(type)) {
				event.setSource(GsonFactory.getRawInstance().fromJson(source, File.class));
			} else if ("folder".equals(type)) {
				event.setSource(GsonFactory.getRawInstance().fromJson(source, Folder.class));
			}
		}
	}

}
