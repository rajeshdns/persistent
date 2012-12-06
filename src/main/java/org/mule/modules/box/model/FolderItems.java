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

import org.mule.modules.box.model.descriptor.FolderItem;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class FolderItems implements Serializable {
	
	private static final long serialVersionUID = -4335709092350643546L;
	
	private int totalCount;
	private List<FolderItem> entries;
	
	@XmlElement(name="total_count")
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<FolderItem> getEntries() {
		return entries;
	}
	public void setEntries(List<FolderItem> entries) {
		this.entries = entries;
	}
	
}
