/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model.response;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
@XmlRootElement(name="response")
public class GetTicketResponse implements Serializable {

	private static final long serialVersionUID = 5167813964487210808L;

	private String status;
	private String ticket;
	
	public boolean isValid() {
		return "get_ticket_ok".equals(this.status);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	
	
}
