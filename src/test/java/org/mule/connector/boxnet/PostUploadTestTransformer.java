package org.mule.connector.boxnet;

import cn.com.believer.songyuanframework.openapi.storage.box.functions.UploadResponse;
import cn.com.believer.songyuanframework.openapi.storage.box.objects.UploadResult;
import org.apache.commons.lang.StringUtils;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

/**
 * @author mariano.gonzalez@mulesoft.com
 */
public class PostUploadTestTransformer extends AbstractMessageTransformer {

    @Override
    public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
        UploadResponse response = (UploadResponse) message.getPayload();
        
        UploadResult file = (UploadResult) response.getUploadResultList().get(0);
        
        String fileId = file.getFile().getFileId();
        assert !StringUtils.isEmpty(fileId) : "File id not getted";

        message.setOutboundProperty("UPLOADED_FILE_ID",fileId );


        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


        return message;
    }
}
