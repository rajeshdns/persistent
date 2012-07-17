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
package cn.com.believer.songyuanframework.openapi.storage.box.functions;

/**
 * @author Jimmy
 * 
 */
public interface AddToTagRequest extends BoxRequest {

    /**
     * @return the authToken
     */
    String getAuthToken();

    /**
     * @param authToken
     *            the authToken to set
     */
    void setAuthToken(String authToken);

    /**
     * @return the tags
     */
    String[] getTags();

    /**
     * @param tags
     *            the tags to set
     */
    void setTags(String[] tags);

    /**
     * @return the target
     */
    String getTarget();

    /**
     * @param target
     *            the target to set
     */
    void setTarget(String target);

    /**
     * @return the targetId
     */
    String getTargetId();

    /**
     * @param targetId
     *            the targetId to set
     */
    void setTargetId(String targetId);
}
