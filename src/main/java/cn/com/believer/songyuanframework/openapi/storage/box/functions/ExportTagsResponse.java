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
public interface ExportTagsResponse extends BoxResponse {

    /**
     * @return the tagList
     */
    public List getTagList();

    /**
     * @param tagList
     *            the tagList to set
     */
    public void setTagList(List tagList);

    /**
     * @return the encodedTags
     */
    public String getEncodedTags();

    /**
     * @param encodedTags
     *            the encodedTags to set
     */
    public void setEncodedTags(String encodedTags);
}
