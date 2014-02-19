
package org.mule.modules.box.config;

import javax.annotation.Generated;
import org.mule.api.processor.MessageProcessor;
import org.mule.config.spring.factories.MessageProcessorChainFactoryBean;
import org.mule.security.oauth.callback.DefaultSaveAccessTokenCallback;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-19T08:18:38-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class SaveAccessTokenCallbackFactoryBean
    extends MessageProcessorChainFactoryBean
{


    public Class getObjectType() {
        return DefaultSaveAccessTokenCallback.class;
    }

    public Object getObject()
        throws Exception
    {
        DefaultSaveAccessTokenCallback callback = new DefaultSaveAccessTokenCallback();
        callback.setMessageProcessor(((MessageProcessor) super.getObject()));
        return callback;
    }

}
