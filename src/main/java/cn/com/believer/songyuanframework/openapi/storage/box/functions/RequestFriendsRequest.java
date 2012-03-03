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

/**
 * @author Jimmy
 * 
 */
public interface RequestFriendsRequest extends BoxRequest {

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
     * @return the emails
     */
    public String[] getEmails();

    /**
     * @param emails
     *            the emails to set
     */
    public void setEmails(String[] emails);

    /**
     * @return the message
     */
    public String getMessage();

    /**
     * @param message
     *            the message to set
     */
    public void setMessage(String message);

    /**
     * @return the params
     */
    public String[] getParams();

    /**
     * @param params
     *            the params to set
     */
    public void setParams(String[] params);
}
