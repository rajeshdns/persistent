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
package cn.com.believer.songyuanframework.openapi.storage.box.impl.simple.functions;

import java.util.List;

import cn.com.believer.songyuanframework.openapi.storage.box.functions.UploadResponse;

/**
 * @author Jimmy
 * 
 */
public class UploadResponseImpl extends BoxResponseImpl implements
        UploadResponse {

    /** a list of UploadResult object. */
    private List uploadResultList;

    /**
     * @return the uploadResultList
     */
    public List getUploadResultList() {
        return this.uploadResultList;
    }

    /**
     * @param uploadResultList
     *            the uploadResultList to set
     */
    public void setUploadResultList(List uploadResultList) {
        this.uploadResultList = uploadResultList;
    }
}
