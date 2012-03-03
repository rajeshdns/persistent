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
public interface BoxTag {

    /**
     * @return the id
     */
    public String getId();

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id);

    /**
     * @return the name
     */
    public String getName();

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name);
}
