/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;

import java.io.Serializable;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class Entity implements Serializable {

	private static final long serialVersionUID = -7462401190978334169L;
	
	/**
	 * string representing the item's type
	 */
	private String type;
	
	/**
	 * the id of the item
	 */
	private String id;
	
	/**
	 * The name of the item
	 */
	private String name;
	
	/**
	 * A unique string identifying the version of this folder
	 */
	private String etag;
	
	/**
	 * A unique ID for use with the /events endpoint
	 */
	private String sequenceId;
	
	public String getEtag() {
		return etag;
	}
	public void setEtag(String etag) {
		this.etag = etag;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSequenceId() {
		return sequenceId;
	}
	
	public void setSequenceId(String sequenceId) {
		this.sequenceId = sequenceId;
	}
}
