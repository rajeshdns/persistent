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

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = -5483075221771438061L;

	private String login;
	private String email;
	private String accessId;
	private String userId;
	private Long spaceAmount;
	private Long spaceUsed;
	private Long maxUploadSize;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement(name="access_id")
	public String getAccessId() {
		return accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
	}

	@XmlElement(name="user_id")
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getSpaceAmount() {
		return spaceAmount;
	}

	public void setSpaceAmount(Long spaceAmount) {
		this.spaceAmount = spaceAmount;
	}

	@XmlElement(name="space_used")
	public Long getSpaceUsed() {
		return spaceUsed;
	}

	public void setSpaceUsed(Long spaceUsed) {
		this.spaceUsed = spaceUsed;
	}

	@XmlElement(name="max_upload_size")
	public Long getMaxUploadSize() {
		return maxUploadSize;
	}

	public void setMaxUploadSize(Long maxUploadSize) {
		this.maxUploadSize = maxUploadSize;
	}
	
	
}
