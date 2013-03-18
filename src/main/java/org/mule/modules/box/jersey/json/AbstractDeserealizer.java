/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.jersey.json;

import org.mule.modules.box.model.Comment;
import org.mule.modules.box.model.Discussion;
import org.mule.modules.box.model.Entity;
import org.mule.modules.box.model.File;
import org.mule.modules.box.model.Folder;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public abstract class AbstractDeserealizer<T> implements JsonDeserializer<T> {
	
	protected Entity parseEntityByType(JsonElement source, Gson gson) {
		JsonObject sourceObject = source.getAsJsonObject();
		JsonElement typeElement = sourceObject.get("type");
		Entity enriched = null;
		
		if (typeElement != null) {
			String type = typeElement.getAsString();
		
			if ("file".equals(type)) {
				enriched = GsonFactory.getRawInstance().fromJson(source, File.class);
			} else if ("folder".equals(type)) {
				enriched = GsonFactory.getRawInstance().fromJson(source, Folder.class);
			} else if ("comment".equals(type)) {
				enriched = GsonFactory.getRawInstance().fromJson(source, Comment.class);
			} else if ("discussion".equals(type)) {
				enriched = GsonFactory.getRawInstance().fromJson(source, Discussion.class);
			}
		}
		
		return enriched != null ? enriched : gson.fromJson(source, Entity.class);
	}

}
