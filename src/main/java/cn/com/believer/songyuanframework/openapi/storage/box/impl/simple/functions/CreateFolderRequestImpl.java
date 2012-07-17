/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

/**
 * All rights reserved.
 */
package cn.com.believer.songyuanframework.openapi.storage.box.impl.simple.functions;

import cn.com.believer.songyuanframework.openapi.storage.box.constant.BoxConstant;
import cn.com.believer.songyuanframework.openapi.storage.box.functions.CreateFolderRequest;

/**
 * @author Jimmy
 * 
 */
public class CreateFolderRequestImpl extends BoxRequestImpl implements
        CreateFolderRequest {

    /** auth token. */
    private String authToken;

    /** parent folder id. */
    private String parentFolderId;

    /** folder name. */
    private String folderName;

    /** share this folder or not. */
    private boolean share;

    /**
     * @return the authToken
     */
    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * @param authToken
     *            the authToken to set
     */
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     * @return the parentFolderId
     */
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    /**
     * @param parentFolderId
     *            the parentFolderId to set
     */
    public void setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    /**
     * @return the folderName
     */
    public String getFolderName() {
        return this.folderName;
    }

    /**
     * @param folderName
     *            the folderName to set
     */
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    /**
     * @return the share
     */
    public boolean isShare() {
        return this.share;
    }

    /**
     * @param share
     *            the share to set
     */
    public void setShare(boolean share) {
        this.share = share;
    }

    /**
     * @return action name
     */
    public String getActionName() {
        return BoxConstant.ACTION_NAME_CREATE_FOLDER;
    }

}
