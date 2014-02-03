
package org.mule.modules.box.config;

import javax.annotation.Generated;
import org.mule.modules.box.model.holders.EntityExpressionHolder;
import org.mule.modules.box.model.holders.UserExpressionHolder;
import org.mule.modules.box.processors.MoveFolderToUserMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-03T12:16:48-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class MoveFolderToUserDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(MoveFolderToUserMessageProcessor.class.getName());
        builder.addConstructorArgValue("moveFolderToUser");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        if (!parseObjectRefWithDefault(element, builder, "target-user", "targetUser", "#[paylaod]")) {
            BeanDefinitionBuilder targetUserBuilder = BeanDefinitionBuilder.rootBeanDefinition(UserExpressionHolder.class.getName());
            Element targetUserChildElement = DomUtils.getChildElementByTagName(element, "target-user");
            if (targetUserChildElement!= null) {
                parseProperty(targetUserBuilder, targetUserChildElement, "serialVersionUID", "serialVersionUID");
                parseProperty(targetUserBuilder, targetUserChildElement, "type", "type");
                parseProperty(targetUserBuilder, targetUserChildElement, "id", "id");
                parseProperty(targetUserBuilder, targetUserChildElement, "name", "name");
                parseProperty(targetUserBuilder, targetUserChildElement, "etag", "etag");
                parseProperty(targetUserBuilder, targetUserChildElement, "sequenceId", "sequenceId");
                parseProperty(targetUserBuilder, targetUserChildElement, "createdAt", "createdAt");
                parseProperty(targetUserBuilder, targetUserChildElement, "modifiedAt", "modifiedAt");
                parseProperty(targetUserBuilder, targetUserChildElement, "role", "role");
                parseProperty(targetUserBuilder, targetUserChildElement, "language", "language");
                parseProperty(targetUserBuilder, targetUserChildElement, "login", "login");
                parseProperty(targetUserBuilder, targetUserChildElement, "spaceAmount", "spaceAmount");
                parseProperty(targetUserBuilder, targetUserChildElement, "spaceUsed", "spaceUsed");
                parseProperty(targetUserBuilder, targetUserChildElement, "maxUploadSize", "maxUploadSize");
                parseProperty(targetUserBuilder, targetUserChildElement, "canSeeManagedUsers", "canSeeManagedUsers");
                parseProperty(targetUserBuilder, targetUserChildElement, "isSyncEnabled", "isSyncEnabled");
                parseProperty(targetUserBuilder, targetUserChildElement, "status", "status");
                parseProperty(targetUserBuilder, targetUserChildElement, "jobTitle", "jobTitle");
                parseProperty(targetUserBuilder, targetUserChildElement, "address", "address");
                parseProperty(targetUserBuilder, targetUserChildElement, "avatarUrl", "avatarUrl");
                parseProperty(targetUserBuilder, targetUserChildElement, "isExemptFromDeviceLimits", "isExemptFromDeviceLimits");
                parseProperty(targetUserBuilder, targetUserChildElement, "isExemptFromLoginVerification", "isExemptFromLoginVerification");
                if (!parseObjectRef(targetUserChildElement, targetUserBuilder, "enterprise", "enterprise")) {
                    BeanDefinitionBuilder _enterpriseBuilder = BeanDefinitionBuilder.rootBeanDefinition(EntityExpressionHolder.class.getName());
                    Element _enterpriseChildElement = DomUtils.getChildElementByTagName(targetUserChildElement, "enterprise");
                    if (_enterpriseChildElement!= null) {
                        parseProperty(_enterpriseBuilder, _enterpriseChildElement, "type", "type");
                        parseProperty(_enterpriseBuilder, _enterpriseChildElement, "id", "id");
                        parseProperty(_enterpriseBuilder, _enterpriseChildElement, "name", "name");
                        parseProperty(_enterpriseBuilder, _enterpriseChildElement, "etag", "etag");
                        parseProperty(_enterpriseBuilder, _enterpriseChildElement, "sequenceId", "sequenceId");
                        targetUserBuilder.addPropertyValue("enterprise", _enterpriseBuilder.getBeanDefinition());
                    }
                }
                builder.addPropertyValue("targetUser", targetUserBuilder.getBeanDefinition());
            }
        }
        parseProperty(builder, element, "folderId", "folderId");
        parseProperty(builder, element, "notify", "notify");
        parseProperty(builder, element, "accessTokenId");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
