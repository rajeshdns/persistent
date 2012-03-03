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

import java.util.List;

/**
 * @author Jimmy
 * 
 */
public interface GetFriendsResponse extends BoxResponse {

    /**
     * @return the friendList
     */
    public List getFriendList();

    /**
     * @param friendList
     *            the friendList to set
     */
    public void setFriendList(List friendList);

    /**
     * @return the encodedFriends
     */
    public String getEncodedFriends();

    /**
     * @param encodedFriends
     *            the encodedFriends to set
     */
    public void setEncodedFriends(String encodedFriends);
}
