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

import org.mule.modules.box.model.Entity;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class SearchResponse implements Serializable {

	private static final long serialVersionUID = 2595886982028079648L;
	
	private Long totalCount;
	private List<Entity> entries;
	private Integer limit;
	private Long offset;
	
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public List<Entity> getEntries() {
		return entries;
	}
	public void setEntries(List<Entity> entries) {
		this.entries = entries;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Long getOffset() {
		return offset;
	}
	public void setOffset(Long offset) {
		this.offset = offset;
	}
}
