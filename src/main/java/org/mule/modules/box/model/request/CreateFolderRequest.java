/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model.request;

import java.io.Serializable;

import org.mule.modules.box.model.Folder;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class CreateFolderRequest implements Serializable {
	
	private static final long serialVersionUID = 9070914509731991571L;
	
	private String name;
	private Folder parent;
	
	public CreateFolderRequest() {}
	
	public CreateFolderRequest(String name, String parentId) {
		this.name = name;
		this.parent = new Folder();
		this.parent.setId(parentId);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Folder getParent() {
		return parent;
	}

	public void setParent(Folder parent) {
		this.parent = parent;
	}
	
	

}
