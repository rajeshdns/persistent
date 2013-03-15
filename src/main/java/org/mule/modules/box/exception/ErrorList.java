/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class ErrorList implements Serializable {

	private static final long serialVersionUID = -6878896011465139195L;
	
	private long totalCount = 0;
	private String type;
	
	private List<Error> entries = new ArrayList<Error>();
	
	public ErrorList addError(Error error) {
		this.entries.add(error);
		this.totalCount++;
		
		return this;
	}
	
	public long getTotalCount() {
		return totalCount;
	}

	public List<Error> getEntries() {
		return entries;
	}

	public void setEntries(List<Error> entries) {
		this.entries = entries;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
