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
	
	@XmlElement(name="access_id")
	private String accessId;
	
	@XmlElement(name="user_id")
	private String userId;
	
	private Long spaceAmount;
	
	@XmlElement(name="space_used")
	private Long spaceUsed;
	
	@XmlElement(name="max_upload_size")
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

	public String getAccessId() {
		return accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
	}

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

	public Long getSpaceUsed() {
		return spaceUsed;
	}

	public void setSpaceUsed(Long spaceUsed) {
		this.spaceUsed = spaceUsed;
	}

	public Long getMaxUploadSize() {
		return maxUploadSize;
	}

	public void setMaxUploadSize(Long maxUploadSize) {
		this.maxUploadSize = maxUploadSize;
	}
	
	
}
