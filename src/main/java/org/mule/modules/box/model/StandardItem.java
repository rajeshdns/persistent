/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author dpelaez@mulesoft.com
 *
 */
public class StandardItem extends Item {

	private static final long serialVersionUID = 1086376841113340059L;

	/**
	 * The description of the item
	 */
	private String description;

	/**
	 * The size of the item in bytes
	 */
	private Long size;

	/**
	 * The path of folders to this item, starting at the root
	 */
	@SerializedName("path_collection")
	private Entries paths;
	
	/**
	 * The time the item was created
	 */
	private String createdAt;
	
	/**
	 * The time the item or its contents were last modified
	 */
	private String modifiedAt;
	
	/**
	 * The time the item or its contents were put in the trash.
	 */
	private String trashedAt;
	
	/**
	 * The time the item or its contents were purged from the trash.
	 */
	private String purgedAt;

	/**
	 * The time the item or its contents were originally created (according to the uploader).
	 */
	private String contentCreatedAt;
	
	/**
	 * The time the item or its contents were originally created (according to the uploader).
	 */
	private String contentModifiedAt;

	/**
	 * The user who created this item
	 */
	private User createdBy;
	
	/**
	 * The user who last modified this item
	 */
	private User modifiedBy;

	/**
	 * The user who owns this item
	 */
	private User ownedBy;
	
	/**
	 * The shared link for this item
	 */
	private SharedLink sharedLink;

	/**
	 * The item that contains this one
	 */
	private Item parent;
	
	/**
	 * Whether this item is deleted or not
	 */
	private String itemStatus;

	/**
	 * The tags applied to this folder
	 */
	private List<String> tags;

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

	public Entries getPaths() {
		return paths;
	}

	public void setPaths(Entries paths) {
		this.paths = paths;
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

	public String getTrashedAt() {
		return trashedAt;
	}

	public void setTrashedAt(String trashedAt) {
		this.trashedAt = trashedAt;
	}

	public String getPurgedAt() {
		return purgedAt;
	}

	public void setPurgedAt(String purgedAt) {
		this.purgedAt = purgedAt;
	}

	public String getContentCreatedAt() {
		return contentCreatedAt;
	}

	public void setContentCreatedAt(String contentCreatedAt) {
		this.contentCreatedAt = contentCreatedAt;
	}

	public String getContentModifiedAt() {
		return contentModifiedAt;
	}

	public void setContentModifiedAt(String contentModifiedAt) {
		this.contentModifiedAt = contentModifiedAt;
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

	public SharedLink getSharedLink() {
		return sharedLink;
	}

	public void setSharedLink(SharedLink sharedLink) {
		this.sharedLink = sharedLink;
	}

	public Item getParent() {
		return parent;
	}

	public void setParent(Item parent) {
		this.parent = parent;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
