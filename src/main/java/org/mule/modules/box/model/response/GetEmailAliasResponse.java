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

import org.mule.modules.box.model.EmailAlias;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class GetEmailAliasResponse implements Serializable {

	private static final long serialVersionUID = -6289518750096333655L;
	
	private Long totalCount;
	private List<EmailAlias> entries;
	
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public List<EmailAlias> getEntries() {
		return entries;
	}
	public void setEntries(List<EmailAlias> entries) {
		this.entries = entries;
	}
	
}
