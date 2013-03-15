/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model.request;

import java.io.Serializable;

import org.mule.modules.box.model.Item;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class CopyItemRequest implements Serializable {
	
	private static final long serialVersionUID = 6738206984167301429L;
	
	/**
	 * Folder object representing the new location of the item
	 */
	private Item parent;
	
	/**
	 * The ID of the destination folder
	 */
	private String id;
	
	/**
	 * An optional new name for the file
	 */
	private String name;

	public Item getParent() {
		return parent;
	}

	public void setParent(Item parent) {
		this.parent = parent;
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
	

}
