
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
import org.mule.modules.box.model.Entity;
import org.mule.modules.box.model.Role;
import org.mule.modules.box.model.User;
import org.mule.modules.box.model.UserStatus;
import org.mule.modules.box.model.holders.EntityExpressionHolder;
import org.mule.modules.box.model.holders.UserExpressionHolder;
import org.mule.transformer.types.DataTypeFactory;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-19T08:18:38-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class UserExpressionHolderTransformer
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
        return (aClass == UserExpressionHolder.class);
    }

    public boolean isSourceDataTypeSupported(DataType<?> dataType) {
        return (dataType.getType() == UserExpressionHolder.class);
    }

    public List<Class<?>> getSourceTypes() {
        return Arrays.asList(new Class<?> [] {UserExpressionHolder.class });
    }

    public List<DataType<?>> getSourceDataTypes() {
        return Arrays.asList(new DataType<?> [] {DataTypeFactory.create(UserExpressionHolder.class)});
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
        return User.class;
    }

    public void setReturnDataType(DataType<?> type) {
        throw new UnsupportedOperationException();
    }

    public DataType<?> getReturnDataType() {
        return DataTypeFactory.create(User.class);
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
        UserExpressionHolder holder = ((UserExpressionHolder) src);
        User result = new User();
        try {
            final String _transformedCreatedAt = ((String) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_createdAtType").getGenericType(), null, holder.getCreatedAt()));
            result.setCreatedAt(_transformedCreatedAt);
            final String _transformedModifiedAt = ((String) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_modifiedAtType").getGenericType(), null, holder.getModifiedAt()));
            result.setModifiedAt(_transformedModifiedAt);
            final Role _transformedRole = ((Role) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_roleType").getGenericType(), null, holder.getRole()));
            result.setRole(_transformedRole);
            final String _transformedLanguage = ((String) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_languageType").getGenericType(), null, holder.getLanguage()));
            result.setLanguage(_transformedLanguage);
            final String _transformedLogin = ((String) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_loginType").getGenericType(), null, holder.getLogin()));
            result.setLogin(_transformedLogin);
            final Long _transformedSpaceAmount = ((Long) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_spaceAmountType").getGenericType(), null, holder.getSpaceAmount()));
            result.setSpaceAmount(_transformedSpaceAmount);
            final Long _transformedSpaceUsed = ((Long) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_spaceUsedType").getGenericType(), null, holder.getSpaceUsed()));
            result.setSpaceUsed(_transformedSpaceUsed);
            final Long _transformedMaxUploadSize = ((Long) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_maxUploadSizeType").getGenericType(), null, holder.getMaxUploadSize()));
            result.setMaxUploadSize(_transformedMaxUploadSize);
            final Boolean _transformedCanSeeManagedUsers = ((Boolean) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_canSeeManagedUsersType").getGenericType(), null, holder.getCanSeeManagedUsers()));
            result.setCanSeeManagedUsers(_transformedCanSeeManagedUsers);
            final Boolean _transformedIsSyncEnabled = ((Boolean) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_isSyncEnabledType").getGenericType(), null, holder.getIsSyncEnabled()));
            result.setIsSyncEnabled(_transformedIsSyncEnabled);
            final UserStatus _transformedStatus = ((UserStatus) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_statusType").getGenericType(), null, holder.getStatus()));
            result.setStatus(_transformedStatus);
            final String _transformedJobTitle = ((String) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_jobTitleType").getGenericType(), null, holder.getJobTitle()));
            result.setJobTitle(_transformedJobTitle);
            final String _transformedAddress = ((String) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_addressType").getGenericType(), null, holder.getAddress()));
            result.setAddress(_transformedAddress);
            final String _transformedAvatarUrl = ((String) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_avatarUrlType").getGenericType(), null, holder.getAvatarUrl()));
            result.setAvatarUrl(_transformedAvatarUrl);
            final Boolean _transformedIsExemptFromDeviceLimits = ((Boolean) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_isExemptFromDeviceLimitsType").getGenericType(), null, holder.getIsExemptFromDeviceLimits()));
            result.setIsExemptFromDeviceLimits(_transformedIsExemptFromDeviceLimits);
            final Boolean _transformedIsExemptFromLoginVerification = ((Boolean) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_isExemptFromLoginVerificationType").getGenericType(), null, holder.getIsExemptFromLoginVerification()));
            result.setIsExemptFromLoginVerification(_transformedIsExemptFromLoginVerification);
            final Entity _transformedEnterprise = ((Entity) evaluateAndTransform(this.muleContext, event, UserExpressionHolder.class.getDeclaredField("_enterpriseType").getGenericType(), null, holder.getEnterprise()));
            result.setEnterprise(_transformedEnterprise);
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
