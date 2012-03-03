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
package cn.com.believer.songyuanframework.openapi.storage.box.functions;

import java.io.File;

/**
 * @author Jimmy
 * 
 */
public interface DownloadRequest extends BoxRequest {

    /**
     * @return the authToken
     */
    public String getAuthToken();

    /**
     * @param authToken
     *            the authToken to set
     */
    public void setAuthToken(String authToken);

    /**
     * @return the fileId
     */
    public String getFileId();

    /**
     * @param fileId
     *            the fileId to set
     */
    public void setFileId(String fileId);

    /**
     * @return the asFile
     */
    public boolean isAsFile();

    /**
     * @param asFile
     *            the asFile to set
     */
    public void setAsFile(boolean asFile);

    /**
     * @return the inFile
     */
    public File getInFile();

    /**
     * @param inFile
     *            the inFile to set
     */
    public void setInFile(File inFile);
}
