
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
import org.mule.modules.box.model.Access;
import org.mule.modules.box.model.Permissions;
import org.mule.modules.box.model.SharedLink;
import org.mule.modules.box.model.holders.SharedLinkExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-03T12:16:48-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class SharedLinkExpressionHolderTransformer
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
        return (aClass == SharedLinkExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == SharedLinkExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {SharedLinkExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(SharedLinkExpressionHolder.class)});
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
        return SharedLink.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(SharedLink.class);
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
        SharedLinkExpressionHolder holder = ((SharedLinkExpressionHolder) src);
        SharedLink result = new SharedLink();
        try {
            final Access _transformedAccess = ((Access) evaluateAndTransform(this.muleContext, event, SharedLinkExpressionHolder.class.getDeclaredField("_accessType").getGenericType(), null, holder.getAccess()));
            result.setAccess(_transformedAccess);
            final Boolean _transformedPasswordEnabled = ((Boolean) evaluateAndTransform(this.muleContext, event, SharedLinkExpressionHolder.class.getDeclaredField("_passwordEnabledType").getGenericType(), null, holder.getPasswordEnabled()));
            result.setPasswordEnabled(_transformedPasswordEnabled);
            final String _transformedUrl = ((String) evaluateAndTransform(this.muleContext, event, SharedLinkExpressionHolder.class.getDeclaredField("_urlType").getGenericType(), null, holder.getUrl()));
            result.setUrl(_transformedUrl);
            final String _transformedDownloadUrl = ((String) evaluateAndTransform(this.muleContext, event, SharedLinkExpressionHolder.class.getDeclaredField("_downloadUrlType").getGenericType(), null, holder.getDownloadUrl()));
            result.setDownloadUrl(_transformedDownloadUrl);
            final String _transformedVanityUrl = ((String) evaluateAndTransform(this.muleContext, event, SharedLinkExpressionHolder.class.getDeclaredField("_vanityUrlType").getGenericType(), null, holder.getVanityUrl()));
            result.setVanityUrl(_transformedVanityUrl);
            final Long _transformedPreviewCount = ((Long) evaluateAndTransform(this.muleContext, event, SharedLinkExpressionHolder.class.getDeclaredField("_previewCountType").getGenericType(), null, holder.getPreviewCount()));
            result.setPreviewCount(_transformedPreviewCount);
            final Long _transformedDownloadCount = ((Long) evaluateAndTransform(this.muleContext, event, SharedLinkExpressionHolder.class.getDeclaredField("_downloadCountType").getGenericType(), null, holder.getDownloadCount()));
            result.setDownloadCount(_transformedDownloadCount);
            final String _transformedUnsharedAt = ((String) evaluateAndTransform(this.muleContext, event, SharedLinkExpressionHolder.class.getDeclaredField("_unsharedAtType").getGenericType(), null, holder.getUnsharedAt()));
            result.setUnsharedAt(_transformedUnsharedAt);
            final Permissions _transformedPermissions = ((Permissions) evaluateAndTransform(this.muleContext, event, SharedLinkExpressionHolder.class.getDeclaredField("_permissionsType").getGenericType(), null, holder.getPermissions()));
            result.setPermissions(_transformedPermissions);
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
