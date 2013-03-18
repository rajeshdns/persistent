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

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class EventDeserializer extends AbstractDeserealizer<Event> {
	
	@Override
	public Event deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		JsonObject event = json.getAsJsonObject();
		JsonElement source = event.get("source");
		Gson gson = GsonFactory.getRawInstance();

		Event result = gson.fromJson(event, Event.class);
		
		if (source != null && source.isJsonObject()) {
			result.setSource(this.parseEntityByType(source, gson));
		}
		
		return result;
	}

}
