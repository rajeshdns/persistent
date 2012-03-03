/**
 * Mule Box.Net Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * All rights reserved.
 */
package cn.com.believer.songyuanframework.openapi.storage.box.impl.simple.functions;

import cn.com.believer.songyuanframework.openapi.storage.box.constant.BoxConstant;
import cn.com.believer.songyuanframework.openapi.storage.box.functions.GetFileInfoRequest;

/**
 * @author Jimmy
 * 
 */
public class GetFileInfoRequestImpl extends BoxRequestImpl implements
        GetFileInfoRequest {

    /** auth token. */
    private String authToken;

    /** file id. */
    private String fileId;

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
     * @return the fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @param fileId
     *            the fileId to set
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * @return action name
     */
    public String getActionName() {
        return BoxConstant.ACTION_NAME_GET_FILE_INFO;
    }
}
