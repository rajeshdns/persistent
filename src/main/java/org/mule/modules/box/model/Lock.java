/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;

import java.io.Serializable;

/**
 * 
 * @author dpelaez@mulesoft.com
 *
 */
public class Lock implements Serializable {
	
	private static final long serialVersionUID = -5587807776750707843L;

	/**
	 * string representing the lock's type
	 */
	private String type;
	
	/**
	 * the id of the lock
	 */
	private String id;
	
	/**
	 * The user who created this lock
	 */
	private User createdBy;
	
	/**
	 * The time the lock was created
	 */
	private String createdAt;
	
	/**
	 * The time the lock expires
	 */
	private String expiresAt;
	
	/**
	 * The time the lock expires
	 */
	private Boolean isDownloadPrevented;

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

	public String getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(String expiresAt) {
		this.expiresAt = expiresAt;
	}

	public Boolean getIsDownloadPrevented() {
		return isDownloadPrevented;
	}

	public void setIsDownloadPrevented(Boolean isDownloadPrevented) {
		this.isDownloadPrevented = isDownloadPrevented;
	}

}
