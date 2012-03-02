package org.mule.connector.boxnet;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

/**
 * Created by IntelliJ IDEA.
 * User: marianogonzalez
 * Date: 3/2/12
 * Time: 2:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class DownloadTestTransformer extends AbstractMessageTransformer {

    @Override
    public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
        byte[] payload = (byte[]) message.getPayload();
        assert payload != null && payload.length > 0 : "null or empty transformer";
        
        String text = new String(payload);

        assert text.equals("Uploaded from Mule!") : "invalid content found. Found: " + text;
        return message;
    }
}
