
package org.mule.modules.box.config;

import javax.annotation.Generated;
import org.mule.modules.box.model.holders.EntityExpressionHolder;
import org.mule.modules.box.model.holders.UserExpressionHolder;
import org.mule.modules.box.processors.UpdateUserMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-03T12:16:48-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class UpdateUserDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(UpdateUserMessageProcessor.class.getName());
        builder.addConstructorArgValue("updateUser");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "userId", "userId");
        if (!parseObjectRefWithDefault(element, builder, "user", "user", "#[payload]")) {
            BeanDefinitionBuilder userBuilder = BeanDefinitionBuilder.rootBeanDefinition(UserExpressionHolder.class.getName());
            Element userChildElement = DomUtils.getChildElementByTagName(element, "user");
            if (userChildElement!= null) {
                parseProperty(userBuilder, userChildElement, "serialVersionUID", "serialVersionUID");
                parseProperty(userBuilder, userChildElement, "type", "type");
                parseProperty(userBuilder, userChildElement, "id", "id");
                parseProperty(userBuilder, userChildElement, "name", "name");
                parseProperty(userBuilder, userChildElement, "etag", "etag");
                parseProperty(userBuilder, userChildElement, "sequenceId", "sequenceId");
                parseProperty(userBuilder, userChildElement, "createdAt", "createdAt");
                parseProperty(userBuilder, userChildElement, "modifiedAt", "modifiedAt");
                parseProperty(userBuilder, userChildElement, "role", "role");
                parseProperty(userBuilder, userChildElement, "language", "language");
                parseProperty(userBuilder, userChildElement, "login", "login");
                parseProperty(userBuilder, userChildElement, "spaceAmount", "spaceAmount");
                parseProperty(userBuilder, userChildElement, "spaceUsed", "spaceUsed");
                parseProperty(userBuilder, userChildElement, "maxUploadSize", "maxUploadSize");
                parseProperty(userBuilder, userChildElement, "canSeeManagedUsers", "canSeeManagedUsers");
                parseProperty(userBuilder, userChildElement, "isSyncEnabled", "isSyncEnabled");
                parseProperty(userBuilder, userChildElement, "status", "status");
                parseProperty(userBuilder, userChildElement, "jobTitle", "jobTitle");
                parseProperty(userBuilder, userChildElement, "address", "address");
                parseProperty(userBuilder, userChildElement, "avatarUrl", "avatarUrl");
                parseProperty(userBuilder, userChildElement, "isExemptFromDeviceLimits", "isExemptFromDeviceLimits");
                parseProperty(userBuilder, userChildElement, "isExemptFromLoginVerification", "isExemptFromLoginVerification");
                if (!parseObjectRef(userChildElement, userBuilder, "enterprise", "enterprise")) {
                    BeanDefinitionBuilder _enterpriseBuilder = BeanDefinitionBuilder.rootBeanDefinition(EntityExpressionHolder.class.getName());
                    Element _enterpriseChildElement = DomUtils.getChildElementByTagName(userChildElement, "enterprise");
                    if (_enterpriseChildElement!= null) {
                        parseProperty(_enterpriseBuilder, _enterpriseChildElement, "type", "type");
                        parseProperty(_enterpriseBuilder, _enterpriseChildElement, "id", "id");
                        parseProperty(_enterpriseBuilder, _enterpriseChildElement, "name", "name");
                        parseProperty(_enterpriseBuilder, _enterpriseChildElement, "etag", "etag");
                        parseProperty(_enterpriseBuilder, _enterpriseChildElement, "sequenceId", "sequenceId");
                        userBuilder.addPropertyValue("enterprise", _enterpriseBuilder.getBeanDefinition());
                    }
                }
                builder.addPropertyValue("user", userBuilder.getBeanDefinition());
            }
        }
        parseProperty(builder, element, "notify", "notify");
        parseProperty(builder, element, "accessTokenId");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
