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
public class Folder extends Item {

	private static final long serialVersionUID = -4254960125347133726L;
	
	/**
	 * The time the folder was created
	 */
	private String createdAt;
	
	/**
	 * The time the folder or its contents were last modified
	 */
	private String modifiedAt;
	
	/**
	 * The description of the folder
	 */
	private String description;
	
	/**
	 * Whether this item is deleted or not
	 */
	private String itemStatus;
	
	/**
	 * The path of folders to this item, starting at the root
	 */
	@SerializedName("path_collection")
	private Entries paths;
	
	/**
	 * The folder size in bytes
	 */
	private Long size;
	
	/**
	 * The shared link for this folder
	 */
	private SharedLink sharedLink;
	
	/**
	 * The user who created this folder
	 */
	private User createdBy;
	
	/**
	 * The user who last modified this folder
	 */
	private User modifiedBy;
	
	/**
	 * The user who owns this folder
	 */
	private User ownedBy;
	
	/**
	 * The folder that contains this one
	 */
	private Item parent;
	
	/**
	 * Descriptors for folders and files contained in this folder
	 */
	@SerializedName("item_collection")
	private GetItemsResponse items;
	
	/**
	 * Whether this folder will be synced by the Box sync clients or not
	 */
	private String syncState;
	
	public String getSyncState() {
		return syncState;
	}
	
	public void setSyncState(String syncState) {
		this.syncState = syncState;
	}
	
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	
	public SharedLink getSharedLink() {
		return sharedLink;
	}
	public void setSharedLink(SharedLink sharedLink) {
		this.sharedLink = sharedLink;
	}
	
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	
	public User getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(User modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	public User getOwnedBy() {
		return ownedBy;
	}
	public void setOwnedBy(User ownedBy) {
		this.ownedBy = ownedBy;
	}
	public Item getParent() {
		return parent;
	}
	public void setParent(Item parent) {
		this.parent = parent;
	}
	
	public GetItemsResponse getItems() {
		return items;
	}
	
	public void setItems(GetItemsResponse items) {
		this.items = items;
	}
	
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	
	public Entries getPaths() {
		return paths;
	}
	public void setPaths(Entries paths) {
		this.paths = paths;
	}
	
}
