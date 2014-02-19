
package org.mule.modules.box.config;

import javax.annotation.Generated;
import org.mule.modules.box.model.holders.PermissionsExpressionHolder;
import org.mule.modules.box.model.holders.SharedLinkExpressionHolder;
import org.mule.modules.box.processors.ShareFolderMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-19T08:18:38-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class ShareFolderDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(ShareFolderMessageProcessor.class.getName());
        builder.addConstructorArgValue("shareFolder");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "folderId", "folderId");
        if (!parseObjectRefWithDefault(element, builder, "shared-link", "sharedLink", "#[payload]")) {
            BeanDefinitionBuilder sharedLinkBuilder = BeanDefinitionBuilder.rootBeanDefinition(SharedLinkExpressionHolder.class.getName());
            Element sharedLinkChildElement = DomUtils.getChildElementByTagName(element, "shared-link");
            if (sharedLinkChildElement!= null) {
                parseProperty(sharedLinkBuilder, sharedLinkChildElement, "access", "access");
                parseProperty(sharedLinkBuilder, sharedLinkChildElement, "passwordEnabled", "passwordEnabled");
                parseProperty(sharedLinkBuilder, sharedLinkChildElement, "url", "url");
                parseProperty(sharedLinkBuilder, sharedLinkChildElement, "downloadUrl", "downloadUrl");
                parseProperty(sharedLinkBuilder, sharedLinkChildElement, "vanityUrl", "vanityUrl");
                parseProperty(sharedLinkBuilder, sharedLinkChildElement, "previewCount", "previewCount");
                parseProperty(sharedLinkBuilder, sharedLinkChildElement, "downloadCount", "downloadCount");
                parseProperty(sharedLinkBuilder, sharedLinkChildElement, "unsharedAt", "unsharedAt");
                if (!parseObjectRef(sharedLinkChildElement, sharedLinkBuilder, "permissions", "permissions")) {
                    BeanDefinitionBuilder _permissionsBuilder = BeanDefinitionBuilder.rootBeanDefinition(PermissionsExpressionHolder.class.getName());
                    Element _permissionsChildElement = DomUtils.getChildElementByTagName(sharedLinkChildElement, "permissions");
                    if (_permissionsChildElement!= null) {
                        parseProperty(_permissionsBuilder, _permissionsChildElement, "preview", "preview");
                        parseProperty(_permissionsBuilder, _permissionsChildElement, "download", "download");
                        sharedLinkBuilder.addPropertyValue("permissions", _permissionsBuilder.getBeanDefinition());
                    }
                }
                builder.addPropertyValue("sharedLink", sharedLinkBuilder.getBeanDefinition());
            }
        }
        parseProperty(builder, element, "accessTokenId");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
