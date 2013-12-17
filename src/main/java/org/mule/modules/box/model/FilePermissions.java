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
 * @author dpelaez@mulesoft.com
 *
 */
public class FilePermissions extends ItemPermissions {

	private static final long serialVersionUID = 2763835017999859145L;
	
	private Boolean canPreview;
	private Boolean canComment;

	public Boolean getCanPreview() {
		return canPreview;
	}
	
	public void setCanPreview(Boolean canPreview) {
		this.canPreview = canPreview;
	}
	
	public Boolean getCanComment() {
		return canComment;
	}
	
	public void setCanComment(Boolean canComment) {
		this.canComment = canComment;
	}
	
}
