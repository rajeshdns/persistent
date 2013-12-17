/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;

/**
 * 
 * @author dpelaez@mulesoft.com
 *
 */
public class FolderPermissions extends ItemPermissions {

	private static final long serialVersionUID = -1701968523098880343L;
	
	private Boolean canInviteCollaborator;

	public Boolean getCanInviteCollaborator() {
		return canInviteCollaborator;
	}

	public void setCanInviteCollaborator(Boolean canInviteCollaborator) {
		this.canInviteCollaborator = canInviteCollaborator;
	}
	
}
