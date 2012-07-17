/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

/**
 * 
 */
package cn.com.believer.songyuanframework.openapi.storage.box.impl.simple.methods;

import java.io.File;
import java.io.IOException;

import cn.com.believer.songyuanframework.openapi.storage.box.constant.BoxConstant;
import cn.com.believer.songyuanframework.openapi.storage.box.factories.BoxResponseFactory;
import cn.com.believer.songyuanframework.openapi.storage.box.functions.DownloadRequest;
import cn.com.believer.songyuanframework.openapi.storage.box.functions.DownloadResponse;

/**
 * @author Jimmy
 * 
 */
public class DownloadMethod extends BaseBoxMethod {

    /**
     * 
     * @param downloadRequest
     *            request
     * @return response
     * @throws IOException
     *             IO exception
     */
    public DownloadResponse download(DownloadRequest downloadRequest)
            throws IOException {
        DownloadResponse downloadResponse = BoxResponseFactory
                .createDownloadResponse();

        String authToken = downloadRequest.getAuthToken();
        String fileId = downloadRequest.getFileId();
        boolean asFile = downloadRequest.isAsFile();
        File inFile = downloadRequest.getInFile();

        StringBuffer urlBuff = new StringBuffer();
        urlBuff.append(apiUrlPrefix);
        urlBuff.append(BoxConstant.SLASH_STRING);
        urlBuff.append(apiVersion);
        urlBuff.append(BoxConstant.SLASH_STRING);
        urlBuff.append(BoxConstant.ACTION_NAME_DOWNLOAD);
        urlBuff.append(BoxConstant.SLASH_STRING);
        urlBuff.append(authToken);
        urlBuff.append(BoxConstant.SLASH_STRING);
        urlBuff.append(fileId);

        downloadResponse.setAsFile(asFile);
        if (asFile) {
            File result = httpManager.doGetFile(urlBuff.toString(), inFile);
            downloadResponse.setOutFile(result);
        } else {
            byte[] result = httpManager.doGetByteArry(urlBuff.toString());
            downloadResponse.setRawData(result);
        }
        return downloadResponse;
    }

}
