/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import org.mule.modules.box.model.descriptor.FolderItem;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class File implements Serializable {
	
	private static final long serialVersionUID = 6127755562219178478L;
	
	private String type;
	private String id;
	private String sequenceId;
	private String name;
	private String description;
	private Long size;
	private String path;
	private String pathId;
	private String createdAt;
	private String modifiedAt;
	private String sha1;
	private String itemStatus;
	private SharedLink sharedLink;
	private String etag;
	private UserInfo createdBy;
	private UserInfo modifiedBy;
	private UserInfo ownedBy;
	private FolderItem parent;
	
    public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@XmlElement(name="sequence_id")
	public String getSequenceId() {
		return sequenceId;
	}
	public void setSequenceId(String sequenceId) {
		this.sequenceId = sequenceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	@XmlElement(name="path_id")
	public String getPathId() {
		return pathId;
	}
	public void setPathId(String pathId) {
		this.pathId = pathId;
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
	
	@XmlElement(name="shared_link")
	public SharedLink getSharedLink() {
		return sharedLink;
	}
	public void setSharedLink(SharedLink sharedLink) {
		this.sharedLink = sharedLink;
	}
	public String getEtag() {
		return etag;
	}
	public void setEtag(String etag) {
		this.etag = etag;
	}
	
	@XmlElement(name="created_by")
	public UserInfo getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(UserInfo createdBy) {
		this.createdBy = createdBy;
	}
	
	@XmlElement(name="modified_by")
	public UserInfo getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(UserInfo modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	@XmlElement(name="owned_by")
	public UserInfo getOwnedBy() {
		return ownedBy;
	}
	public void setOwnedBy(UserInfo ownedBy) {
		this.ownedBy = ownedBy;
	}
	
	public FolderItem getParent() {
		return parent;
	}
	public void setParent(FolderItem parent) {
		this.parent = parent;
	}
	public String getSha1() {
		return sha1;
	}
	public void setSha1(String sha1) {
		this.sha1 = sha1;
	}
	@XmlElement(name="item_status")
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	
}
