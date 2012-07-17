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
package cn.com.believer.songyuanframework.openapi.storage.box.objects;

/**
 * @author Jimmy
 * 
 */
public interface Box {

    /**
     * get the box id.
     * 
     * @return the id
     */
    public String getId();

    /**
     * set the box id.
     * 
     * @param id
     *            the id to set
     */
    public void setId(String id);

    /**
     * get box URL.
     * 
     * @return the url
     */
    public String getUrl();

    /**
     * set box URL.
     * 
     * @param url
     *            the url to set
     */
    public void setUrl(String url);

    /**
     * get box status.
     * 
     * @return the status
     */
    public String getStatus();

    /**
     * set box status.
     * 
     * @param status
     *            the status to set
     */
    public void setStatus(String status);
}
