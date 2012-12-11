/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;

import javax.xml.bind.annotation.XmlElement;

import org.mule.modules.box.model.descriptor.EntityDescriptor;
import org.mule.modules.box.model.descriptor.FolderItem;
import org.mule.modules.box.model.descriptor.UserDescriptor;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class Folder extends EntityDescriptor {

	private static final long serialVersionUID = -4254960125347133726L;
	
	private String sequenceId;
	private String etag;
	private String createdAt;
	private String modifiedAt;
	private String description;
	private String itemStatus;
	private Long size;
	private SharedLink sharedLink;
	private UserDescriptor createdBy;
	private UserDescriptor modifiedBy;
	private UserDescriptor ownedBy;
	private FolderItem parent;
	private FolderItems items;
    	
	@XmlElement(name="sequence_id")
	public String getSequenceId() {
		return sequenceId;
	}
	public void setSequenceId(String sequenceId) {
		this.sequenceId = sequenceId;
	}

	@XmlElement(name="created_at")
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	@XmlElement(name="modified_at")
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
	
	@XmlElement(name="shared_link")
	public SharedLink getSharedLink() {
		return sharedLink;
	}
	public void setSharedLink(SharedLink sharedLink) {
		this.sharedLink = sharedLink;
	}
	
	@XmlElement(name="created_by")
	public UserDescriptor getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(UserDescriptor createdBy) {
		this.createdBy = createdBy;
	}
	
	@XmlElement(name="modified_by")
	public UserDescriptor getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(UserDescriptor modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	@XmlElement(name="owned_by")
	public UserDescriptor getOwnedBy() {
		return ownedBy;
	}
	public void setOwnedBy(UserDescriptor ownedBy) {
		this.ownedBy = ownedBy;
	}
	public FolderItem getParent() {
		return parent;
	}
	public void setParent(FolderItem parent) {
		this.parent = parent;
	}
	
	@XmlElement(name="item_collection")
	public FolderItems getItems() {
		return items;
	}
	
	public void setItems(FolderItems items) {
		this.items = items;
	}
	public String getEtag() {
		return etag;
	}
	public void setEtag(String etag) {
		this.etag = etag;
	}
	
	@XmlElement(name="item_status")
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
}
