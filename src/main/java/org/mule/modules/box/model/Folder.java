/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * Folders contain information about the items contained inside of them, including files and other folders.
 * There is also a set of metadata such as who owns the folder and when it was modified that is also returned.
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class Folder extends StandardItem {

	private static final long serialVersionUID = -4254960125347133726L;
	
	/**
	 * The email-to-upload address for this folder
	 */
	private FolderUploadEmail folderUploadEmail;
	
	/**
	 * Descriptors for folders and files contained in this folder
	 */
	@SerializedName("item_collection")
	private GetItemsResponse items;
	
	/**
	 * Whether this folder will be synced by the Box sync clients or not
	 */
	private String syncState;
	
	/**
	 * Whether this folder has any collaborators
	 */
	private Boolean hasCollaborations;
	
	/**
	 * The permissions that the current user has on this folder. 
	 */
	private FolderPermissions permissions;
	
	
	public FolderUploadEmail getFolderUploadEmail() {
		return folderUploadEmail;
	}

	public void setFolderUploadEmail(FolderUploadEmail folderUploadEmail) {
		this.folderUploadEmail = folderUploadEmail;
	}

	public GetItemsResponse getItems() {
		return items;
	}
	
	public void setItems(GetItemsResponse items) {
		this.items = items;
	}

	public String getSyncState() {
		return syncState;
	}
	
	public void setSyncState(String syncState) {
		this.syncState = syncState;
	}

	public Boolean getHasCollaborations() {
		return hasCollaborations;
	}

	public void setHasCollaborations(Boolean hasCollaborations) {
		this.hasCollaborations = hasCollaborations;
	}

	public FolderPermissions getPermissions() {
		return permissions;
	}

	public void setPermissions(FolderPermissions permissions) {
		this.permissions = permissions;
	}
	
}
