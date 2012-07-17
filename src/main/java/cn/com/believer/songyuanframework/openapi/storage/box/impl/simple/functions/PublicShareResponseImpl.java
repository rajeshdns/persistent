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

import cn.com.believer.songyuanframework.openapi.storage.box.functions.PublicShareResponse;

/**
 * @author Jimmy
 * 
 */
public class PublicShareResponseImpl extends BoxResponseImpl implements
        PublicShareResponse {

    /** public name. */
    private String publicName;

    /**
     * @return the publicName
     */
    public String getPublicName() {
        return this.publicName;
    }

    /**
     * @param publicName
     *            the publicName to set
     */
    public void setPublicName(String publicName) {
        this.publicName = publicName;
    }

}
