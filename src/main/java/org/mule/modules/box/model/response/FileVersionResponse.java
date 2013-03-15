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

import org.mule.modules.box.model.FileVersion;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class FileVersionResponse implements Serializable {
	
	private static final long serialVersionUID = 8361951761894868630L;
	
	private long totalCount;
	private List<FileVersion> entries;
	
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public List<FileVersion> getEntries() {
		return entries;
	}
	public void setEntries(List<FileVersion> entries) {
		this.entries = entries;
	}


}
