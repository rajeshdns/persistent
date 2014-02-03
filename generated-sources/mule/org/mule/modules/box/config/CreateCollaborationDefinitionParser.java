
package org.mule.modules.box.config;

import javax.annotation.Generated;
import org.mule.modules.box.model.holders.CollaborationExpressionHolder;
import org.mule.modules.box.model.holders.EntityExpressionHolder;
import org.mule.modules.box.model.holders.ItemExpressionHolder;
import org.mule.modules.box.model.holders.UserExpressionHolder;
import org.mule.modules.box.processors.CreateCollaborationMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-03T12:16:48-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class CreateCollaborationDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(CreateCollaborationMessageProcessor.class.getName());
        builder.addConstructorArgValue("createCollaboration");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        if (!parseObjectRefWithDefault(element, builder, "collaboration", "collaboration", "#[payload]")) {
            BeanDefinitionBuilder collaborationBuilder = BeanDefinitionBuilder.rootBeanDefinition(CollaborationExpressionHolder.class.getName());
            Element collaborationChildElement = DomUtils.getChildElementByTagName(element, "collaboration");
            if (collaborationChildElement!= null) {
                parseProperty(collaborationBuilder, collaborationChildElement, "serialVersionUID", "serialVersionUID");
                parseProperty(collaborationBuilder, collaborationChildElement, "type", "type");
                parseProperty(collaborationBuilder, collaborationChildElement, "id", "id");
                parseProperty(collaborationBuilder, collaborationChildElement, "name", "name");
                parseProperty(collaborationBuilder, collaborationChildElement, "etag", "etag");
                parseProperty(collaborationBuilder, collaborationChildElement, "sequenceId", "sequenceId");
                if (!parseObjectRef(collaborationChildElement, collaborationBuilder, "created-by", "createdBy")) {
                    BeanDefinitionBuilder _createdByBuilder = BeanDefinitionBuilder.rootBeanDefinition(UserExpressionHolder.class.getName());
                    Element _createdByChildElement = DomUtils.getChildElementByTagName(collaborationChildElement, "created-by");
                    if (_createdByChildElement!= null) {
                        parseProperty(_createdByBuilder, _createdByChildElement, "serialVersionUID", "serialVersionUID");
                        parseProperty(_createdByBuilder, _createdByChildElement, "type", "type");
                        parseProperty(_createdByBuilder, _createdByChildElement, "id", "id");
                        parseProperty(_createdByBuilder, _createdByChildElement, "name", "name");
                        parseProperty(_createdByBuilder, _createdByChildElement, "etag", "etag");
                        parseProperty(_createdByBuilder, _createdByChildElement, "sequenceId", "sequenceId");
                        parseProperty(_createdByBuilder, _createdByChildElement, "createdAt", "createdAt");
                        parseProperty(_createdByBuilder, _createdByChildElement, "modifiedAt", "modifiedAt");
                        parseProperty(_createdByBuilder, _createdByChildElement, "role", "role");
                        parseProperty(_createdByBuilder, _createdByChildElement, "language", "language");
                        parseProperty(_createdByBuilder, _createdByChildElement, "login", "login");
                        parseProperty(_createdByBuilder, _createdByChildElement, "spaceAmount", "spaceAmount");
                        parseProperty(_createdByBuilder, _createdByChildElement, "spaceUsed", "spaceUsed");
                        parseProperty(_createdByBuilder, _createdByChildElement, "maxUploadSize", "maxUploadSize");
                        parseProperty(_createdByBuilder, _createdByChildElement, "canSeeManagedUsers", "canSeeManagedUsers");
                        parseProperty(_createdByBuilder, _createdByChildElement, "isSyncEnabled", "isSyncEnabled");
                        parseProperty(_createdByBuilder, _createdByChildElement, "status", "status");
                        parseProperty(_createdByBuilder, _createdByChildElement, "jobTitle", "jobTitle");
                        parseProperty(_createdByBuilder, _createdByChildElement, "address", "address");
                        parseProperty(_createdByBuilder, _createdByChildElement, "avatarUrl", "avatarUrl");
                        parseProperty(_createdByBuilder, _createdByChildElement, "isExemptFromDeviceLimits", "isExemptFromDeviceLimits");
                        parseProperty(_createdByBuilder, _createdByChildElement, "isExemptFromLoginVerification", "isExemptFromLoginVerification");
                        if (!parseObjectRef(_createdByChildElement, _createdByBuilder, "enterprise", "enterprise")) {
                            BeanDefinitionBuilder __enterpriseBuilder = BeanDefinitionBuilder.rootBeanDefinition(EntityExpressionHolder.class.getName());
                            Element __enterpriseChildElement = DomUtils.getChildElementByTagName(_createdByChildElement, "enterprise");
                            if (__enterpriseChildElement!= null) {
                                parseProperty(__enterpriseBuilder, __enterpriseChildElement, "type", "type");
                                parseProperty(__enterpriseBuilder, __enterpriseChildElement, "id", "id");
                                parseProperty(__enterpriseBuilder, __enterpriseChildElement, "name", "name");
                                parseProperty(__enterpriseBuilder, __enterpriseChildElement, "etag", "etag");
                                parseProperty(__enterpriseBuilder, __enterpriseChildElement, "sequenceId", "sequenceId");
                                _createdByBuilder.addPropertyValue("enterprise", __enterpriseBuilder.getBeanDefinition());
                            }
                        }
                        collaborationBuilder.addPropertyValue("createdBy", _createdByBuilder.getBeanDefinition());
                    }
                }
                parseProperty(collaborationBuilder, collaborationChildElement, "createdAt", "createdAt");
                parseProperty(collaborationBuilder, collaborationChildElement, "modifiedAt", "modifiedAt");
                parseProperty(collaborationBuilder, collaborationChildElement, "expiresAt", "expiresAt");
                parseProperty(collaborationBuilder, collaborationChildElement, "status", "status");
                if (!parseObjectRef(collaborationChildElement, collaborationBuilder, "accessible-by", "accessibleBy")) {
                    BeanDefinitionBuilder _accessibleByBuilder = BeanDefinitionBuilder.rootBeanDefinition(UserExpressionHolder.class.getName());
                    Element _accessibleByChildElement = DomUtils.getChildElementByTagName(collaborationChildElement, "accessible-by");
                    if (_accessibleByChildElement!= null) {
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "serialVersionUID", "serialVersionUID");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "type", "type");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "id", "id");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "name", "name");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "etag", "etag");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "sequenceId", "sequenceId");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "createdAt", "createdAt");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "modifiedAt", "modifiedAt");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "role", "role");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "language", "language");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "login", "login");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "spaceAmount", "spaceAmount");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "spaceUsed", "spaceUsed");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "maxUploadSize", "maxUploadSize");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "canSeeManagedUsers", "canSeeManagedUsers");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "isSyncEnabled", "isSyncEnabled");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "status", "status");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "jobTitle", "jobTitle");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "address", "address");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "avatarUrl", "avatarUrl");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "isExemptFromDeviceLimits", "isExemptFromDeviceLimits");
                        parseProperty(_accessibleByBuilder, _accessibleByChildElement, "isExemptFromLoginVerification", "isExemptFromLoginVerification");
                        if (!parseObjectRef(_accessibleByChildElement, _accessibleByBuilder, "enterprise", "enterprise")) {
                            BeanDefinitionBuilder __enterpriseBuilder = BeanDefinitionBuilder.rootBeanDefinition(EntityExpressionHolder.class.getName());
                            Element __enterpriseChildElement = DomUtils.getChildElementByTagName(_accessibleByChildElement, "enterprise");
                            if (__enterpriseChildElement!= null) {
                                parseProperty(__enterpriseBuilder, __enterpriseChildElement, "type", "type");
                                parseProperty(__enterpriseBuilder, __enterpriseChildElement, "id", "id");
                                parseProperty(__enterpriseBuilder, __enterpriseChildElement, "name", "name");
                                parseProperty(__enterpriseBuilder, __enterpriseChildElement, "etag", "etag");
                                parseProperty(__enterpriseBuilder, __enterpriseChildElement, "sequenceId", "sequenceId");
                                _accessibleByBuilder.addPropertyValue("enterprise", __enterpriseBuilder.getBeanDefinition());
                            }
                        }
                        collaborationBuilder.addPropertyValue("accessibleBy", _accessibleByBuilder.getBeanDefinition());
                    }
                }
                parseProperty(collaborationBuilder, collaborationChildElement, "role", "role");
                parseProperty(collaborationBuilder, collaborationChildElement, "acknowledgedAt", "acknowledgedAt");
                if (!parseObjectRef(collaborationChildElement, collaborationBuilder, "item", "item")) {
                    BeanDefinitionBuilder _itemBuilder = BeanDefinitionBuilder.rootBeanDefinition(ItemExpressionHolder.class.getName());
                    Element _itemChildElement = DomUtils.getChildElementByTagName(collaborationChildElement, "item");
                    if (_itemChildElement!= null) {
                        parseProperty(_itemBuilder, _itemChildElement, "serialVersionUID", "serialVersionUID");
                        parseProperty(_itemBuilder, _itemChildElement, "type", "type");
                        parseProperty(_itemBuilder, _itemChildElement, "id", "id");
                        parseProperty(_itemBuilder, _itemChildElement, "name", "name");
                        parseProperty(_itemBuilder, _itemChildElement, "etag", "etag");
                        parseProperty(_itemBuilder, _itemChildElement, "sequenceId", "sequenceId");
                        parseProperty(_itemBuilder, _itemChildElement, "sha1", "sha1");
                        collaborationBuilder.addPropertyValue("item", _itemBuilder.getBeanDefinition());
                    }
                }
                builder.addPropertyValue("collaboration", collaborationBuilder.getBeanDefinition());
            }
        }
        parseProperty(builder, element, "accessTokenId");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
