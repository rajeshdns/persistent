/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model.response;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.mule.modules.box.model.User;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
@XmlRootElement(name="response")
public class GetAuthTokenResponse implements Serializable {
	
	private static final long serialVersionUID = -2702752413755354540L;
	
	private String status;
	
	private String authToken;
	
	private User user;
	
	public boolean isNotLoggedIn() {
		return "not_logged_in".equals(this.status);
	}
	
	public boolean isValid() {
		return "get_auth_token_ok".equals(this.status);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@XmlElement(name="auth_token")
	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
}
