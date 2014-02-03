
package org.mule.modules.box.processors;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.processor.MessageProcessor;
import org.mule.common.DefaultResult;
import org.mule.common.Result;
import org.mule.common.metadata.DefaultMetaData;
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.modules.box.BoxConnector;
import org.mule.modules.box.exception.BoxTokenExpiredException;
import org.mule.modules.box.model.response.GetEventsResponse;
import org.mule.modules.box.oauth.BoxConnectorOAuthManager;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * GetEnterpriseEventsMessageProcessor invokes the {@link org.mule.modules.box.BoxConnector#getEnterpriseEvents(java.lang.String, java.lang.String, java.util.List, java.lang.Long, java.lang.Long)} method in {@link BoxConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-03T12:16:48-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class GetEnterpriseEventsMessageProcessor
    extends AbstractConnectedProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object createdAfter;
    protected String _createdAfterType;
    protected Object createdBefore;
    protected String _createdBeforeType;
    protected Object eventTypes;
    protected List<String> _eventTypesType;
    protected Object limit;
    protected Long _limitType;
    protected Object offset;
    protected Long _offsetType;

    public GetEnterpriseEventsMessageProcessor(String operationName) {
        super(operationName);
    }

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    @Override
    public void start()
        throws MuleException
    {
        super.start();
    }

    @Override
    public void stop()
        throws MuleException
    {
        super.stop();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    /**
     * Sets limit
     * 
     * @param value Value to set
     */
    public void setLimit(Object value) {
        this.limit = value;
    }

    /**
     * Sets createdAfter
     * 
     * @param value Value to set
     */
    public void setCreatedAfter(Object value) {
        this.createdAfter = value;
    }

    /**
     * Sets offset
     * 
     * @param value Value to set
     */
    public void setOffset(Object value) {
        this.offset = value;
    }

    /**
     * Sets createdBefore
     * 
     * @param value Value to set
     */
    public void setCreatedBefore(Object value) {
        this.createdBefore = value;
    }

    /**
     * Sets eventTypes
     * 
     * @param value Value to set
     */
    public void setEventTypes(Object value) {
        this.eventTypes = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws Exception
     */
    public MuleEvent doProcess(final MuleEvent event)
        throws Exception
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(BoxConnectorOAuthManager.class, false, event);
            final String _transformedCreatedAfter = ((String) evaluateAndTransform(getMuleContext(), event, GetEnterpriseEventsMessageProcessor.class.getDeclaredField("_createdAfterType").getGenericType(), null, createdAfter));
            final String _transformedCreatedBefore = ((String) evaluateAndTransform(getMuleContext(), event, GetEnterpriseEventsMessageProcessor.class.getDeclaredField("_createdBeforeType").getGenericType(), null, createdBefore));
            final List<String> _transformedEventTypes = ((List<String> ) evaluateAndTransform(getMuleContext(), event, GetEnterpriseEventsMessageProcessor.class.getDeclaredField("_eventTypesType").getGenericType(), null, eventTypes));
            final Long _transformedLimit = ((Long) evaluateAndTransform(getMuleContext(), event, GetEnterpriseEventsMessageProcessor.class.getDeclaredField("_limitType").getGenericType(), null, limit));
            final Long _transformedOffset = ((Long) evaluateAndTransform(getMuleContext(), event, GetEnterpriseEventsMessageProcessor.class.getDeclaredField("_offsetType").getGenericType(), null, offset));
            Object resultPayload;
            ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class<? extends Exception>> getManagedExceptions() {
                    return Arrays.asList(((Class<? extends Exception> []) new Class[] {BoxTokenExpiredException.class }));
                }

                public boolean isProtected() {
                    return true;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((BoxConnector) object).getEnterpriseEvents(_transformedCreatedAfter, _transformedCreatedBefore, _transformedEventTypes, _transformedLimit, _transformedOffset);
                }

            }
            , this, event);
            event.getMessage().setPayload(resultPayload);
            return event;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(null, (Result.Status.SUCCESS));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(GetEventsResponse.class)));
    }

    private MetaDataModel getPojoOrSimpleModel(Class clazz) {
        DataType dataType = DataTypeFactory.getInstance().getDataType(clazz);
        if (DataType.POJO.equals(dataType)) {
            return new DefaultPojoMetaDataModel(clazz);
        } else {
            return new DefaultSimpleMetaDataModel(dataType);
        }
    }

}
