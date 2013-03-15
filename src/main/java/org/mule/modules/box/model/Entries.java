/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class Entries implements Serializable {

	private static final long serialVersionUID = -2104625659342586532L;
	
	private long totalCount;
	private List<Entity> entries;
	
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public List<Entity> getEntries() {
		return entries;
	}
	public void setEntries(List<Entity> entries) {
		this.entries = entries;
	}
}
