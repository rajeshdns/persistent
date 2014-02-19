
package org.mule.modules.box.model.request.transformers;

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
import org.mule.modules.box.model.Access;
import org.mule.modules.box.model.FolderUploadEmail;
import org.mule.modules.box.model.Item;
import org.mule.modules.box.model.Permissions;
import org.mule.modules.box.model.SharedLink;
import org.mule.modules.box.model.request.UpdateItemRequest;
import org.mule.modules.box.model.request.holders.UpdateItemRequestExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-19T08:18:38-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class UpdateItemRequestExpressionHolderTransformer
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
        return (aClass == UpdateItemRequestExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == UpdateItemRequestExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {UpdateItemRequestExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(UpdateItemRequestExpressionHolder.class)});
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
        return UpdateItemRequest.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(UpdateItemRequest.class);
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
        UpdateItemRequestExpressionHolder holder = ((UpdateItemRequestExpressionHolder) src);
        UpdateItemRequest result = new UpdateItemRequest();
        try {
            final String _transformedName = ((String) evaluateAndTransform(this.muleContext, event, UpdateItemRequestExpressionHolder.class.getDeclaredField("_nameType").getGenericType(), null, holder.getName()));
            result.setName(_transformedName);
            final String _transformedDescription = ((String) evaluateAndTransform(this.muleContext, event, UpdateItemRequestExpressionHolder.class.getDeclaredField("_descriptionType").getGenericType(), null, holder.getDescription()));
            result.setDescription(_transformedDescription);
            final Item _transformedParent = ((Item) evaluateAndTransform(this.muleContext, event, UpdateItemRequestExpressionHolder.class.getDeclaredField("_parentType").getGenericType(), null, holder.getParent()));
            result.setParent(_transformedParent);
            final String _transformedParentId = ((String) evaluateAndTransform(this.muleContext, event, UpdateItemRequestExpressionHolder.class.getDeclaredField("_parentIdType").getGenericType(), null, holder.getParentId()));
            result.setParentId(_transformedParentId);
            final SharedLink _transformedSharedLink = ((SharedLink) evaluateAndTransform(this.muleContext, event, UpdateItemRequestExpressionHolder.class.getDeclaredField("_sharedLinkType").getGenericType(), null, holder.getSharedLink()));
            result.setSharedLink(_transformedSharedLink);
            final Access _transformedAccess = ((Access) evaluateAndTransform(this.muleContext, event, UpdateItemRequestExpressionHolder.class.getDeclaredField("_accessType").getGenericType(), null, holder.getAccess()));
            result.setAccess(_transformedAccess);
            final String _transformedUnsharedAt = ((String) evaluateAndTransform(this.muleContext, event, UpdateItemRequestExpressionHolder.class.getDeclaredField("_unsharedAtType").getGenericType(), null, holder.getUnsharedAt()));
            result.setUnsharedAt(_transformedUnsharedAt);
            final Permissions _transformedPermissions = ((Permissions) evaluateAndTransform(this.muleContext, event, UpdateItemRequestExpressionHolder.class.getDeclaredField("_permissionsType").getGenericType(), null, holder.getPermissions()));
            result.setPermissions(_transformedPermissions);
            final Boolean _transformedCanDownload = ((Boolean) evaluateAndTransform(this.muleContext, event, UpdateItemRequestExpressionHolder.class.getDeclaredField("_canDownloadType").getGenericType(), null, holder.getCanDownload()));
            result.setCanDownload(_transformedCanDownload);
            final Boolean _transformedCanPreview = ((Boolean) evaluateAndTransform(this.muleContext, event, UpdateItemRequestExpressionHolder.class.getDeclaredField("_canPreviewType").getGenericType(), null, holder.getCanPreview()));
            result.setCanPreview(_transformedCanPreview);
            final FolderUploadEmail _transformedFolderUploadEmail = ((FolderUploadEmail) evaluateAndTransform(this.muleContext, event, UpdateItemRequestExpressionHolder.class.getDeclaredField("_folderUploadEmailType").getGenericType(), null, holder.getFolderUploadEmail()));
            result.setFolderUploadEmail(_transformedFolderUploadEmail);
            final List<String> _transformedTags = ((List<String> ) evaluateAndTransform(this.muleContext, event, UpdateItemRequestExpressionHolder.class.getDeclaredField("_tagsType").getGenericType(), null, holder.getTags()));
            result.setTags(_transformedTags);
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
