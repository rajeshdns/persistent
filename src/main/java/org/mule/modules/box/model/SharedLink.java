/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;

import java.io.Serializable;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class SharedLink implements Serializable {

	private static final long serialVersionUID = -7687170653187915720L;
	
	private Access access;
	private Boolean passwordEnabled;
	private String url;
	private String downloadUrl;
	private String vanityUrl;
	private Long previewCount;
	private Long downloadCount;
	private String unsharedAt;
	private Permissions permissions;
	
    public Boolean isPasswordEnabled() {
		return passwordEnabled;
	}

	public void setPasswordEnabled(Boolean passwordEnabled) {
		this.passwordEnabled = passwordEnabled;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public Long getPreviewCount() {
		return previewCount;
	}

	public void setPreviewCount(Long previewCount) {
		this.previewCount = previewCount;
	}
	
	public Long getDownloadCount() {
		return downloadCount;
	}

	public void setDownloadCount(Long downloadCount) {
		this.downloadCount = downloadCount;
	}

	public String getUnsharedAt() {
		return unsharedAt;
	}

	public void setUnsharedAt(String unsharedAt) {
		this.unsharedAt = unsharedAt;
	}

	public Permissions getPermissions() {
		return permissions;
	}

	public void setPermissions(Permissions permissions) {
		this.permissions = permissions;
	}

	public void setAccess(Access access) {
		this.access = access;
	}
	
	public Access getAccess() {
		return access;
	}

	public String getVanityUrl() {
		return vanityUrl;
	}

	public void setVanityUrl(String vanityUrl) {
		this.vanityUrl = vanityUrl;
	}
	
	
}
