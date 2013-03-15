/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model.response;

import java.io.Serializable;
import java.util.List;

import org.mule.modules.box.model.User;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class GetUsersResponse implements Serializable {

	private static final long serialVersionUID = 7324141555786127870L;
	
	private int totalCount;
	private List<User> entries;
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<User> getEntries() {
		return entries;
	}
	public void setEntries(List<User> entries) {
		this.entries = entries;
	}
}
