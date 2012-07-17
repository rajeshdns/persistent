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

import cn.com.believer.songyuanframework.openapi.storage.box.functions.CreateFolderResponse;
import cn.com.believer.songyuanframework.openapi.storage.box.objects.BoxFolder;

/**
 * @author Jimmy
 * 
 */
public class CreateFolderResponseImpl extends BoxResponseImpl implements
        CreateFolderResponse {

    /** created folder. */
    private BoxFolder folder;

    /**
     * @return the folder
     */
    public BoxFolder getFolder() {
        return this.folder;
    }

    /**
     * @param folder
     *            the folder to set
     */
    public void setFolder(BoxFolder folder) {
        this.folder = folder;
    }
}
