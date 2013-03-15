/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model.request;

import java.io.Serializable;

import org.mule.modules.box.model.SharedLink;

/**
 * Request object for creating a shared link
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class CreateSharedLinkRequest implements Serializable {

	
	private static final long serialVersionUID = -3575803012819146504L;
	
	/**
	 * The shared link object
	 */
	private SharedLink sharedLink;

	public SharedLink getSharedLink() {
		return sharedLink;
	}

	public void setSharedLink(SharedLink sharedLink) {
		this.sharedLink = sharedLink;
	}
	
}
