/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;


/**
 * File objects represent that metadata about individual files in Box, with attributes describing who created the file,
 * when it was last modified, and other information. The actual content of the file itself is accessible through
 * download operation
 * 
 * @author mariano.gonzalez@mulesoft.com
 */
public class File extends StandardItem {
	
	private static final long serialVersionUID = 6127755562219178478L;
	
	/**
	 * The version of the file
	 */
	private String versionNumber;
	
	/**
	 * The number of comments on a file
	 */
	private Long commentCount;
	
	/**
	 * The permissions that the current user has on this file
	 */
	private FilePermissions permissions;
	
	/**
	 * The lock held on the file
	 */
	private Lock lock;

	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public Long getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}

	public FilePermissions getPermissions() {
		return permissions;
	}

	public void setPermissions(FilePermissions permissions) {
		this.permissions = permissions;
	}

	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}
	
}
