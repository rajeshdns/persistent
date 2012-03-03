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
package cn.com.believer.songyuanframework.openapi.storage.box.objects;

/**
 * @author Jimmy
 * 
 */
public interface BoxSubscription {

    /**
     * @return the boxId
     */
    public String getBoxId();

    /**
     * @param boxId
     *            the boxId to set
     */
    public void setBoxId(String boxId);

    /**
     * @return the userName
     */
    public String getUserName();

    /**
     * @param userName
     *            the userName to set
     */
    public void setUserName(String userName);

    /**
     * @return the url
     */
    public String getUrl();

    /**
     * @param url
     *            the url to set
     */
    public void setUrl(String url);

    /**
     * @return the status
     */
    public String getStatus();

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(String status);
}
