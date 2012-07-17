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

import java.util.List;

import cn.com.believer.songyuanframework.openapi.storage.box.functions.GetFriendsResponse;

/**
 * @author Jimmy
 * 
 */
public class GetFriendsResponseImpl extends BoxResponseImpl implements
        GetFriendsResponse {

    /** friend list, BoxFriend object list. */
    private List friendList;

    /** base64 encoded string of XML. */
    private String encodedFriends;

    /**
     * @return the friendList
     */
    public List getFriendList() {
        return this.friendList;
    }

    /**
     * @param friendList
     *            the friendList to set
     */
    public void setFriendList(List friendList) {
        this.friendList = friendList;
    }

    /**
     * @return the encodedFriends
     */
    public String getEncodedFriends() {
        return this.encodedFriends;
    }

    /**
     * @param encodedFriends
     *            the encodedFriends to set
     */
    public void setEncodedFriends(String encodedFriends) {
        this.encodedFriends = encodedFriends;
    }
}
