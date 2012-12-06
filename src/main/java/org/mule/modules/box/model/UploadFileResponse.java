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

import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class UploadFileResponse implements Serializable {

	private static final long serialVersionUID = -8182169706166443150L;
	
	private long totalCount;
	private List<File> entries;
	
	@XmlElement(name="total_count")
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public List<File> getEntries() {
		return entries;
	}
	public void setEntries(List<File> entries) {
		this.entries = entries;
	}
	
	
}
