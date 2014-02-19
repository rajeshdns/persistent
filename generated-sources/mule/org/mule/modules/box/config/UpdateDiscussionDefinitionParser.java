
package org.mule.modules.box.config;

import javax.annotation.Generated;
import org.mule.modules.box.model.holders.DiscussionExpressionHolder;
import org.mule.modules.box.model.holders.EntityExpressionHolder;
import org.mule.modules.box.model.holders.ItemExpressionHolder;
import org.mule.modules.box.model.holders.UserExpressionHolder;
import org.mule.modules.box.processors.UpdateDiscussionMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-19T08:18:38-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class UpdateDiscussionDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(UpdateDiscussionMessageProcessor.class.getName());
        builder.addConstructorArgValue("updateDiscussion");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        if (!parseObjectRefWithDefault(element, builder, "discussion", "discussion", "#[payload]")) {
            BeanDefinitionBuilder discussionBuilder = BeanDefinitionBuilder.rootBeanDefinition(DiscussionExpressionHolder.class.getName());
            Element discussionChildElement = DomUtils.getChildElementByTagName(element, "discussion");
            if (discussionChildElement!= null) {
                parseProperty(discussionBuilder, discussionChildElement, "serialVersionUID", "serialVersionUID");
                parseProperty(discussionBuilder, discussionChildElement, "type", "type");
                parseProperty(discussionBuilder, discussionChildElement, "id", "id");
                parseProperty(discussionBuilder, discussionChildElement, "name", "name");
                parseProperty(discussionBuilder, discussionChildElement, "etag", "etag");
                parseProperty(discussionBuilder, discussionChildElement, "sequenceId", "sequenceId");
                if (!parseObjectRef(discussionChildElement, discussionBuilder, "parent", "parent")) {
                    BeanDefinitionBuilder _parentBuilder = BeanDefinitionBuilder.rootBeanDefinition(ItemExpressionHolder.class.getName());
                    Element _parentChildElement = DomUtils.getChildElementByTagName(discussionChildElement, "parent");
                    if (_parentChildElement!= null) {
                        parseProperty(_parentBuilder, _parentChildElement, "serialVersionUID", "serialVersionUID");
                        parseProperty(_parentBuilder, _parentChildElement, "type", "type");
                        parseProperty(_parentBuilder, _parentChildElement, "id", "id");
                        parseProperty(_parentBuilder, _parentChildElement, "name", "name");
                        parseProperty(_parentBuilder, _parentChildElement, "etag", "etag");
                        parseProperty(_parentBuilder, _parentChildElement, "sequenceId", "sequenceId");
                        parseProperty(_parentBuilder, _parentChildElement, "sha1", "sha1");
                        discussionBuilder.addPropertyValue("parent", _parentBuilder.getBeanDefinition());
                    }
                }
                parseProperty(discussionBuilder, discussionChildElement, "description", "description");
                if (!parseObjectRef(discussionChildElement, discussionBuilder, "created-by", "createdBy")) {
                    BeanDefinitionBuilder _createdByBuilder = BeanDefinitionBuilder.rootBeanDefinition(UserExpressionHolder.class.getName());
                    Element _createdByChildElement = DomUtils.getChildElementByTagName(discussionChildElement, "created-by");
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
                        discussionBuilder.addPropertyValue("createdBy", _createdByBuilder.getBeanDefinition());
                    }
                }
                parseProperty(discussionBuilder, discussionChildElement, "createdAt", "createdAt");
                parseProperty(discussionBuilder, discussionChildElement, "modifiedAt", "modifiedAt");
                builder.addPropertyValue("discussion", discussionBuilder.getBeanDefinition());
            }
        }
        parseProperty(builder, element, "discussionId", "discussionId");
        parseProperty(builder, element, "accessTokenId");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
