
package org.mule.modules.box.model.transformers;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.endpoint.ImmutableEndpoint;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.transformer.DataType;
import org.mule.api.transformer.DiscoverableTransformer;
import org.mule.api.transformer.MessageTransformer;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transformer.TransformerMessagingException;
import org.mule.config.i18n.CoreMessages;
import org.mule.devkit.processor.ExpressionEvaluatorSupport;
import org.mule.modules.box.model.Collaboration;
import org.mule.modules.box.model.Collaboration.CollaborationStatus;
import org.mule.modules.box.model.Item;
import org.mule.modules.box.model.User;
import org.mule.modules.box.model.holders.CollaborationExpressionHolder;
import org.mule.modules.box.model.holders.EntityExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-19T08:18:38-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class CollaborationExpressionHolderTransformer
    extends ExpressionEvaluatorSupport
    implements DiscoverableTransformer, MessageTransformer
{

    private int weighting = DiscoverableTransformer.DEFAULT_PRIORITY_WEIGHTING;
    private ImmutableEndpoint endpoint;
    private MuleContext muleContext;
    private String name;

    public int getPriorityWeighting() {
        return weighting;
    }

    public void setPriorityWeighting(int weighting) {
        this.weighting = weighting;
    }

    public boolean isSourceTypeSupported(Class<?> aClass) {
        return (aClass == CollaborationExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == CollaborationExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {CollaborationExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(CollaborationExpressionHolder.class)});
    }

    public boolean isAcceptNull() {
        return false;
    }

    public boolean isIgnoreBadInput() {
        return false;
    }

    public Object transform(Object src)
        throws TransformerException
    {
        throw new UnsupportedOperationException();
    }

    public Object transform(Object src, String encoding)
        throws TransformerException
    {
        throw new UnsupportedOperationException();
    }

    public void setReturnClass(Class<?> theClass) {
        throw new UnsupportedOperationException();
    }

    public Class<?> getReturnClass() {
        return Collaboration.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(Collaboration.class);
    }

    public void setEndpoint(ImmutableEndpoint ep) {
        endpoint = ep;
    }

    public ImmutableEndpoint getEndpoint() {
        return endpoint;
    }

    public void dispose() {
    }

    public void initialise()
        throws InitialisationException
    {
    }

    public void setMuleContext(MuleContext context) {
        muleContext = context;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public Object transform(Object src, MuleEvent event)
        throws TransformerMessagingException
    {
        return transform(src, null, event);
    }

    public Object transform(Object src, String encoding, MuleEvent event)
        throws TransformerMessagingException
    {
        if (src == null) {
            return null;
        }
        CollaborationExpressionHolder holder = ((CollaborationExpressionHolder) src);
        Collaboration result = new Collaboration();
        try {
            final User _transformedCreatedBy = ((User) evaluateAndTransform(this.muleContext, event, CollaborationExpressionHolder.class.getDeclaredField("_createdByType").getGenericType(), null, holder.getCreatedBy()));
            result.setCreatedBy(_transformedCreatedBy);
            final String _transformedCreatedAt = ((String) evaluateAndTransform(this.muleContext, event, CollaborationExpressionHolder.class.getDeclaredField("_createdAtType").getGenericType(), null, holder.getCreatedAt()));
            result.setCreatedAt(_transformedCreatedAt);
            final String _transformedModifiedAt = ((String) evaluateAndTransform(this.muleContext, event, CollaborationExpressionHolder.class.getDeclaredField("_modifiedAtType").getGenericType(), null, holder.getModifiedAt()));
            result.setModifiedAt(_transformedModifiedAt);
            final String _transformedExpiresAt = ((String) evaluateAndTransform(this.muleContext, event, CollaborationExpressionHolder.class.getDeclaredField("_expiresAtType").getGenericType(), null, holder.getExpiresAt()));
            result.setExpiresAt(_transformedExpiresAt);
            final CollaborationStatus _transformedStatus = ((CollaborationStatus) evaluateAndTransform(this.muleContext, event, CollaborationExpressionHolder.class.getDeclaredField("_statusType").getGenericType(), null, holder.getStatus()));
            result.setStatus(_transformedStatus);
            final User _transformedAccessibleBy = ((User) evaluateAndTransform(this.muleContext, event, CollaborationExpressionHolder.class.getDeclaredField("_accessibleByType").getGenericType(), null, holder.getAccessibleBy()));
            result.setAccessibleBy(_transformedAccessibleBy);
            final String _transformedRole = ((String) evaluateAndTransform(this.muleContext, event, CollaborationExpressionHolder.class.getDeclaredField("_roleType").getGenericType(), null, holder.getRole()));
            result.setRole(_transformedRole);
            final String _transformedAcknowledgedAt = ((String) evaluateAndTransform(this.muleContext, event, CollaborationExpressionHolder.class.getDeclaredField("_acknowledgedAtType").getGenericType(), null, holder.getAcknowledgedAt()));
            result.setAcknowledgedAt(_transformedAcknowledgedAt);
            final Item _transformedItem = ((Item) evaluateAndTransform(this.muleContext, event, CollaborationExpressionHolder.class.getDeclaredField("_itemType").getGenericType(), null, holder.getItem()));
            result.setItem(_transformedItem);
            final String _transformedType = ((String) evaluateAndTransform(this.muleContext, event, EntityExpressionHolder.class.getDeclaredField("_typeType").getGenericType(), null, holder.getType()));
            result.setType(_transformedType);
            final String _transformedId = ((String) evaluateAndTransform(this.muleContext, event, EntityExpressionHolder.class.getDeclaredField("_idType").getGenericType(), null, holder.getId()));
            result.setId(_transformedId);
            final String _transformedName = ((String) evaluateAndTransform(this.muleContext, event, EntityExpressionHolder.class.getDeclaredField("_nameType").getGenericType(), null, holder.getName()));
            result.setName(_transformedName);
            final String _transformedEtag = ((String) evaluateAndTransform(this.muleContext, event, EntityExpressionHolder.class.getDeclaredField("_etagType").getGenericType(), null, holder.getEtag()));
            result.setEtag(_transformedEtag);
            final String _transformedSequenceId = ((String) evaluateAndTransform(this.muleContext, event, EntityExpressionHolder.class.getDeclaredField("_sequenceIdType").getGenericType(), null, holder.getSequenceId()));
            result.setSequenceId(_transformedSequenceId);
        } catch (NoSuchFieldException e) {
            throw new TransformerMessagingException(CoreMessages.createStaticMessage("internal error"), event, this, e);
        } catch (TransformerException e) {
            throw new TransformerMessagingException(e.getI18nMessage(), event, this, e);
        }
        return result;
    }

    public MuleEvent process(MuleEvent event) {
        return null;
    }

    public String getMimeType() {
        return null;
    }

    public String getEncoding() {
        return null;
    }

    public MuleContext getMuleContext() {
        return muleContext;
    }

}