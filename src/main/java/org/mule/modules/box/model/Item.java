/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;


/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class Item extends Entity {

	private static final long serialVersionUID = 3406333075012024404L;
	
	/**
	 * The sha1 hash of this item
	 */
	private String sha1;
	
	public String getSha1() {
		return sha1;
	}

	public void setSha1(String sha1) {
		this.sha1 = sha1;
	}
	
}
