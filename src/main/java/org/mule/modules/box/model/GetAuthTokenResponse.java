package org.mule.modules.box.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
@XmlRootElement
public class GetAuthTokenResponse implements Serializable {
	
	private static final long serialVersionUID = -2702752413755354540L;
	
	private ResponseElement response;
	
	public String getStatus() {
		return this.response != null ? this.response.status : null;
	}
	
	public String getAuthToken() {
		if (this.response != null) {
			return this.response.authToken;
		}
		
		throw new IllegalStateException("Auth token response is null");
	}

	public ResponseElement getResponse() {
		return response;
	}

	public void setResponse(ResponseElement response) {
		this.response = response;
	}
	
	
	public boolean isValid() {
		return "get_auth_token_ok".equals(this.response.status);
	}

	public static class ResponseElement implements Serializable {
		
		private static final long serialVersionUID = 5773198039708564030L;
		
		
		private String status;
		
		@XmlElement(name="auth_token")
		private String authToken;
		
		private User user;

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

		public String getAuthToken() {
			return authToken;
		}

		public void setAuthToken(String authToken) {
			this.authToken = authToken;
		}
		
	}

}
