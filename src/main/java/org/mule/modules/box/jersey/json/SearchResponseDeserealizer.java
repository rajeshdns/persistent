/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.jersey.json;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.mule.modules.box.model.Entity;
import org.mule.modules.box.model.response.SearchResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class SearchResponseDeserealizer extends AbstractDeserealizer<SearchResponse> {

	@Override
	public SearchResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		JsonObject object = null;
		
		if (json.isJsonObject()) {
			object = json.getAsJsonObject();
		} else {
			throw new RuntimeException("Json element is not an object");
		}
		
		Gson gson = GsonFactory.getRawInstance();
		JsonElement entries = object.remove("entries");
		
		SearchResponse response = gson.fromJson(json, SearchResponse.class);
		response.setEntries(this.parseEntries(entries, gson));
		
		return response;
	}
	
	private List<Entity> parseEntries(JsonElement entries, Gson gson) {
		JsonArray array = null;
		List<Entity> parsedEntities = new ArrayList<Entity>();
		
		if (entries != null && entries.isJsonArray()) {
			array = entries.getAsJsonArray();
		} else {
			return parsedEntities;
		}
		
		for (JsonElement element : array) {
			parsedEntities.add(this.parseEntityByType(element, gson));
		}
		
		return parsedEntities;
	}

}
