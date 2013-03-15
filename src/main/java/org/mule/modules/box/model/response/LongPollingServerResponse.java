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

import org.mule.modules.box.model.LongPollingServer;


/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class LongPollingServerResponse implements Serializable {

	private static final long serialVersionUID = -8934595447569347300L;
	
	private Long chunkSize;
	private List<LongPollingServer> entries;
	
	public Long getChunkSize() {
		return chunkSize;
	}
	public void setChunkSize(Long chunkSize) {
		this.chunkSize = chunkSize;
	}
	public List<LongPollingServer> getEntries() {
		return entries;
	}
	public void setEntries(List<LongPollingServer> entries) {
		this.entries = entries;
	}
}
