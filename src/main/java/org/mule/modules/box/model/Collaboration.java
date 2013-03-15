/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;


/**
 * Collaborations are Box’s equivalent of access control lists.
 * They can be used to set and apply permissions for users to folders. 
 * 
 * @author mariano.gonzalez@mulesoft.com
 */
public class Collaboration extends Entity {
	
	private static final long serialVersionUID = -9160092964332743659L;
	
	public static enum CollaborationStatus {
		accepted,
		pending,
		rejected
	}
	
	/**
	 * The user who created this collaboration
	 */
	private User createdBy;
	
	/**
	 * The time this collaboration was created
	 */
	private String createdAt;
	
	/**
	 * The time this collaboration was last modified
	 */
	private String modifiedAt;
	
	/**
	 * The time this collaboration will expire
	 */
	private String expiresAt;
	
	/**
	 * The status of this collab
	 */
	private CollaborationStatus status;
	
	/**
	 * The user who the collaboration applies to
	 */
	private User accessibleBy;
	
	/**
	 * The level of access this user has
	 */
	private String role;
	
	/**
	 * When the status of this collab was changed
	 */
	private String acknowledgedAt;
	
	/**
	 * The folder this discussion is related to
	 */
	private Item item;
	
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
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
	
	public String getExpiresAt() {
		return expiresAt;
	}
	public void setExpiresAt(String expiresAt) {
		this.expiresAt = expiresAt;
	}
	public CollaborationStatus getStatus() {
		return status;
	}
	public void setStatus(CollaborationStatus status) {
		this.status = status;
	}
	
	public User getAccessibleBy() {
		return accessibleBy;
	}
	public void setAccessibleBy(User accessibleBy) {
		this.accessibleBy = accessibleBy;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getAcknowledgedAt() {
		return acknowledgedAt;
	}
	public void setAcknowledgedAt(String acknowledgedAt) {
		this.acknowledgedAt = acknowledgedAt;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
}
