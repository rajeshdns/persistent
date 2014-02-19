
package org.mule.modules.box.processors;

import java.io.InputStream;
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
import org.mule.modules.box.model.File;
import org.mule.modules.box.oauth.BoxConnectorOAuthManager;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * UploadNewVersionStreamMessageProcessor invokes the {@link org.mule.modules.box.BoxConnector#uploadNewVersionStream(java.io.InputStream, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link BoxConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-19T08:18:38-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class UploadNewVersionStreamMessageProcessor
    extends AbstractConnectedProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object content;
    protected InputStream _contentType;
    protected Object fileId;
    protected String _fileIdType;
    protected Object etag;
    protected String _etagType;
    protected Object filename;
    protected String _filenameType;
    protected Object contentModifiedAt;
    protected String _contentModifiedAtType;

    public UploadNewVersionStreamMessageProcessor(String operationName) {
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
     * Sets contentModifiedAt
     * 
     * @param value Value to set
     */
    public void setContentModifiedAt(Object value) {
        this.contentModifiedAt = value;
    }

    /**
     * Sets fileId
     * 
     * @param value Value to set
     */
    public void setFileId(Object value) {
        this.fileId = value;
    }

    /**
     * Sets content
     * 
     * @param value Value to set
     */
    public void setContent(Object value) {
        this.content = value;
    }

    /**
     * Sets etag
     * 
     * @param value Value to set
     */
    public void setEtag(Object value) {
        this.etag = value;
    }

    /**
     * Sets filename
     * 
     * @param value Value to set
     */
    public void setFilename(Object value) {
        this.filename = value;
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
            final InputStream _transformedContent = ((InputStream) evaluateAndTransform(getMuleContext(), event, UploadNewVersionStreamMessageProcessor.class.getDeclaredField("_contentType").getGenericType(), null, content));
            final String _transformedFileId = ((String) evaluateAndTransform(getMuleContext(), event, UploadNewVersionStreamMessageProcessor.class.getDeclaredField("_fileIdType").getGenericType(), null, fileId));
            final String _transformedEtag = ((String) evaluateAndTransform(getMuleContext(), event, UploadNewVersionStreamMessageProcessor.class.getDeclaredField("_etagType").getGenericType(), null, etag));
            final String _transformedFilename = ((String) evaluateAndTransform(getMuleContext(), event, UploadNewVersionStreamMessageProcessor.class.getDeclaredField("_filenameType").getGenericType(), null, filename));
            final String _transformedContentModifiedAt = ((String) evaluateAndTransform(getMuleContext(), event, UploadNewVersionStreamMessageProcessor.class.getDeclaredField("_contentModifiedAtType").getGenericType(), null, contentModifiedAt));
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
                    return ((BoxConnector) object).uploadNewVersionStream(_transformedContent, _transformedFileId, _transformedEtag, _transformedFilename, _transformedContentModifiedAt);
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
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(InputStream.class)));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(File.class)));
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