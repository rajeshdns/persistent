/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

/**
 * 
 */
package cn.com.believer.songyuanframework.openapi.storage.box.functions;

/**
 * This is the super interface for all box response, you can set and get a
 * status string from this response.
 * 
 * @author jjia
 * 
 */
public interface BoxResponse {

    /**
     * get the status string.
     * 
     * @return the status
     */
    String getStatus();

    /**
     * set the status string.
     * 
     * @param status
     *            the status to set
     */
    void setStatus(String status);
}
