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
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class PollingEvent implements Serializable {
	
	private static final long serialVersionUID = -8178977589920931658L;
	
	private String version;
	private String message;
	
	public boolean isNewEvent() {
		return "new_change".equals(this.message);
	}
	
	public boolean isReconnect() {
		return "reconnect".equals(this.message);
	}
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
