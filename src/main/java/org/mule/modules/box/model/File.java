/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;


/**
 * File objects represent that metadata about individual files in Box, with attributes describing who created the file,
 * when it was last modified, and other information. The actual content of the file itself is accessible through
 * download operation
 * 
 * @author mariano.gonzalez@mulesoft.com
 */
public class File extends Item {
	
	private static final long serialVersionUID = 6127755562219178478L;
	
	/**
	 * The description of this file
	 */
	private String description;
	
	/**
	 * Size of this file in bytes
	 */
	private Long size;
	
	/**
	 * When this file was created on Box’s servers
	 */
	private String createdAt;
	
	/**
	 * When this file was last updated on the Box servers
	 */
	private String modifiedAt;
	
	/**
	 * When this file was last moved to the trash
	 */
	private String trashedAt;
	
	/**
	 * When this file will be permanently deleted
	 */
	private String purgedAt;
	
	/**
	 * When the content of this file was created
	 */
	private String contentCreatedAt;
	
	/**
	 * When the content of this file was last modified
	 */
	private String contentModifiedAt;
	
	/**
	 * The path of folders to this item, starting at the root
	 */
	private Entries paths;
	
	/**
	 * Whether this item is deleted or not
	 */
	private String itemStatus;
	
	private SharedLink sharedLink;
	
	/**
	 * The user who first created file
	 */
	private User createdBy;
	
	/**
	 * The user who last updated this file
	 */
	private User modifiedBy;
	
	/**
	 * The user who owns this file
	 */
	private User ownedBy;
	
	/**
	 * The folder this file is contained in
	 */
	private Item parent;
	
	
	
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
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
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
	
	public Entries getPaths() {
		return paths;
	}
	public void setPaths(Entries paths) {
		this.paths = paths;
	}
}
