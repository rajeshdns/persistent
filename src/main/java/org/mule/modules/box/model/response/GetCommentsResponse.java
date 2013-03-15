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

import org.mule.modules.box.model.Comment;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class GetCommentsResponse implements Serializable {

	private static final long serialVersionUID = 898153858649940748L;
	
	private Long totalCount;
	private List<Comment> entries;
	
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public List<Comment> getEntries() {
		return entries;
	}
	public void setEntries(List<Comment> entries) {
		this.entries = entries;
	}
}
