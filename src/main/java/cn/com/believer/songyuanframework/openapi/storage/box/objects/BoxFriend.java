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

import java.util.List;

/**
 * @author Jimmy
 * 
 */
public interface BoxFriend {

    /**
     * @return the name
     */
    public String getName();

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name);

    /**
     * @return the email
     */
    public String getEmail();

    /**
     * @param email
     *            the email to set
     */
    public void setEmail(String email);

    /**
     * @return the accepted
     */
    public String getAccepted();

    /**
     * @param accepted
     *            the accepted to set
     */
    public void setAccepted(String accepted);

    /**
     * @return the avatarUrl
     */
    public String getAvatarUrl();

    /**
     * @param avatarUrl
     *            the avatarUrl to set
     */
    public void setAvatarUrl(String avatarUrl);

    /**
     * @return the boxes
     */
    public List getBoxes();

    /**
     * @param boxes
     *            the boxes to set
     */
    public void setBoxes(List boxes);

    /**
     * @return the subscriptions
     */
    public List getSubscriptions();

    /**
     * @param subscriptions
     *            the subscriptions to set
     */
    public void setSubscriptions(List subscriptions);
}
