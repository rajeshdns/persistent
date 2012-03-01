package org.mule.connector.boxnet;

import cn.com.believer.songyuanframework.openapi.storage.box.functions.CreateFolderResponse;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import java.io.InputStream;
/**
 * @author mariano.gonzalez@mulesoft.com
 */
public class PreUploadTransformer extends AbstractMessageTransformer {

    @Override
    public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
        CreateFolderResponse response = (CreateFolderResponse) message.getPayload();
        message.setOutboundProperty("CREATED_FOLDER_ID", response.getFolder().getFolderId());
        
        InputStream in = this.getClass().getResourceAsStream("/testFile.txt");
        assert in != null : "test file not found";

        message.setPayload(in);

        
        return message;

    }
}
