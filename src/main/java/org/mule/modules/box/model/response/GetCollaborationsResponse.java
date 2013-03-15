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

import org.mule.modules.box.model.Collaboration;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class GetCollaborationsResponse implements Serializable {
	
	private static final long serialVersionUID = 6957912698510817233L;
	
	private int totalCount;
	private List<Collaboration> entries;
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<Collaboration> getEntries() {
		return entries;
	}
	public void setEntries(List<Collaboration> entries) {
		this.entries = entries;
	}

}
