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
public interface DownloadResponse extends BoxResponse {

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
     * @return the rawData
     */
    public byte[] getRawData();

    /**
     * @param rawData
     *            the rawData to set
     */
    public void setRawData(byte[] rawData);

    /**
     * @return the outFile
     */
    public File getOutFile();

    /**
     * @param outFile
     *            the outFile to set
     */
    public void setOutFile(File outFile);
}
