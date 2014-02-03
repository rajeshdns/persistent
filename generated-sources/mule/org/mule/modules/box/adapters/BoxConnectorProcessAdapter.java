
package org.mule.modules.box.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.box.BoxConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>BoxConnectorProcessAdapter</code> is a wrapper around {@link BoxConnector } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-03T12:16:48-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class BoxConnectorProcessAdapter
    extends BoxConnectorLifecycleAdapter
    implements ProcessAdapter<BoxConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, BoxConnectorCapabilitiesAdapter> getProcessTemplate() {
        final BoxConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,BoxConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, BoxConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, BoxConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
