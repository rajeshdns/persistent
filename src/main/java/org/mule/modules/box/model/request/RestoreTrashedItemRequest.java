/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model.request;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;

import org.mule.modules.box.model.Item;

/**
 * Request object for restoring items from the trash
 *
 * @author mariano.gonzalez@mulesoft.com
 */
public class RestoreTrashedItemRequest implements Serializable {
	
	private static final long serialVersionUID = 94008240835040493L;
	
	/**
	 *  The new parent folder for this item
	 */
	private Item parent;
	
	/**
	 *  The id of the new parent folder
	 */
	private String newParentId;
	
	/**
	 * The new name for this item
	 */
	private String newName;
	
	public Item getParent() {
		return parent;
	}
	public void setParent(Item parent) {
		this.parent = parent;
	}
	
	@XmlAttribute(name="id")
	public String getNewParentId() {
		return newParentId;
	}
	public void setNewParentId(String newParentId) {
		this.newParentId = newParentId;
	}
	
	@XmlAttribute(name="name")
	public String getNewName() {
		return newName;
	}
	public void setNewName(String newName) {
		this.newName = newName;
	}
	
	


}
