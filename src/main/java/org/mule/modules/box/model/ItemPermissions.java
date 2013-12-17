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
import java.io.Serializable;

public abstract class ItemPermissions implements Serializable{

	private static final long serialVersionUID = 1814618407193497049L;
	
	private Boolean canDownload;
	private Boolean canUpload;
	private Boolean canRename;
	private Boolean canDelete;
	private Boolean canShare;
	private Boolean canSetShareAccess;
	
	public Boolean getCanDownload() {
		return canDownload;
	}
	
	public void setCanDownload(Boolean canDownload) {
		this.canDownload = canDownload;
	}
	
	public Boolean getCanUpload() {
		return canUpload;
	}
	
	public void setCanUpload(Boolean canUpload) {
		this.canUpload = canUpload;
	}
	
	public Boolean getCanRename() {
		return canRename;
	}
	
	public void setCanRename(Boolean canRename) {
		this.canRename = canRename;
	}
	
	public Boolean getCanDelete() {
		return canDelete;
	}
	
	public void setCanDelete(Boolean canDelete) {
		this.canDelete = canDelete;
	}
	
	public Boolean getCanShare() {
		return canShare;
	}
	
	public void setCanShare(Boolean canShare) {
		this.canShare = canShare;
	}
	
	public Boolean getCanSetShareAccess() {
		return canSetShareAccess;
	}
	
	public void setCanSetShareAccess(Boolean canSetShareAccess) {
		this.canSetShareAccess = canSetShareAccess;
	}
	
}
