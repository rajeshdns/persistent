/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model.request;

import java.io.Serializable;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class CopyFolderRequest implements Serializable {
	
	private static final long serialVersionUID = 6738206984167301429L;
	
	private Parent parent = new Parent();
	
	public CopyFolderRequest(){}
	
	public CopyFolderRequest(String id) {
		this.parent.setId(id);
	}

	public Parent getParent() {
		return parent;
	}
	
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	

	public static class Parent implements Serializable {
		
		private static final long serialVersionUID = -3923791983970569171L;

		private String id;
		
		public String getId() {
			return id;
		}
		
		public void setId(String id) {
			this.id = id;
		}
	}
	
}
