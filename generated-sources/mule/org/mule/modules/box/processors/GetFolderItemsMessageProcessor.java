
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
import org.mule.common.metadata.DefaultListMetaDataModel;
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
import org.mule.modules.box.model.Item;
import org.mule.modules.box.oauth.BoxConnectorOAuthManager;
import org.mule.security.oauth.callback.ProcessCallback;
import org.mule.streaming.PagingConfiguration;
import org.mule.streaming.PagingDelegate;


/**
 * GetFolderItemsMessageProcessor invokes the {@link org.mule.modules.box.BoxConnector#getFolderItems(java.lang.String, java.lang.Long, java.lang.Long, org.mule.streaming.PagingConfiguration)} method in {@link BoxConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-03T12:16:48-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class GetFolderItemsMessageProcessor
    extends AbstractPagedConnectedProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object folderId;
    protected String _folderIdType;
    protected Object limit;
    protected Long _limitType;
    protected Object offset;
    protected Long _offsetType;
    protected Object pagingConfiguration;
    protected PagingConfiguration _pagingConfigurationType;

    public GetFolderItemsMessageProcessor(String operationName) {
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
     * Sets pagingConfiguration
     * 
     * @param value Value to set
     */
    public void setPagingConfiguration(Object value) {
        this.pagingConfiguration = value;
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
     * Sets offset
     * 
     * @param value Value to set
     */
    public void setOffset(Object value) {
        this.offset = value;
    }

    /**
     * Sets folderId
     * 
     * @param value Value to set
     */
    public void setFolderId(Object value) {
        this.folderId = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws Exception
     */
    public PagingDelegate getPagingDelegate(final MuleEvent event, final PagingConfiguration pagingConfiguration)
        throws Exception
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(BoxConnectorOAuthManager.class, false, event);
            final String _transformedFolderId = ((String) evaluateAndTransform(getMuleContext(), event, GetFolderItemsMessageProcessor.class.getDeclaredField("_folderIdType").getGenericType(), null, folderId));
            final Long _transformedLimit = ((Long) evaluateAndTransform(getMuleContext(), event, GetFolderItemsMessageProcessor.class.getDeclaredField("_limitType").getGenericType(), null, limit));
            final Long _transformedOffset = ((Long) evaluateAndTransform(getMuleContext(), event, GetFolderItemsMessageProcessor.class.getDeclaredField("_offsetType").getGenericType(), null, offset));
            final PagingConfiguration _transformedPagingConfiguration = ((PagingConfiguration) evaluateAndTransform(getMuleContext(), event, GetFolderItemsMessageProcessor.class.getDeclaredField("_pagingConfigurationType").getGenericType(), null, pagingConfiguration));
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
                    return ((BoxConnector) object).getFolderItems(_transformedFolderId, _transformedLimit, _transformedOffset, _transformedPagingConfiguration);
                }

            }
            , this, event);
            return ((PagingDelegate) resultPayload);
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
        return new DefaultResult<MetaData>(new DefaultMetaData(new DefaultListMetaDataModel(getPojoOrSimpleModel(Item.class))));
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
