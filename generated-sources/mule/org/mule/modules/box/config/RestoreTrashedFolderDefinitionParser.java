
package org.mule.modules.box.config;

import javax.annotation.Generated;
import org.mule.modules.box.model.holders.ItemExpressionHolder;
import org.mule.modules.box.model.request.holders.RestoreTrashedItemRequestExpressionHolder;
import org.mule.modules.box.processors.RestoreTrashedFolderMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-03T12:16:48-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class RestoreTrashedFolderDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(RestoreTrashedFolderMessageProcessor.class.getName());
        builder.addConstructorArgValue("restoreTrashedFolder");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "folderId", "folderId");
        if (!parseObjectRefWithDefault(element, builder, "request", "request", "#[payload]")) {
            BeanDefinitionBuilder requestBuilder = BeanDefinitionBuilder.rootBeanDefinition(RestoreTrashedItemRequestExpressionHolder.class.getName());
            Element requestChildElement = DomUtils.getChildElementByTagName(element, "request");
            if (requestChildElement!= null) {
                if (!parseObjectRef(requestChildElement, requestBuilder, "parent", "parent")) {
                    BeanDefinitionBuilder _parentBuilder = BeanDefinitionBuilder.rootBeanDefinition(ItemExpressionHolder.class.getName());
                    Element _parentChildElement = DomUtils.getChildElementByTagName(requestChildElement, "parent");
                    if (_parentChildElement!= null) {
                        parseProperty(_parentBuilder, _parentChildElement, "serialVersionUID", "serialVersionUID");
                        parseProperty(_parentBuilder, _parentChildElement, "type", "type");
                        parseProperty(_parentBuilder, _parentChildElement, "id", "id");
                        parseProperty(_parentBuilder, _parentChildElement, "name", "name");
                        parseProperty(_parentBuilder, _parentChildElement, "etag", "etag");
                        parseProperty(_parentBuilder, _parentChildElement, "sequenceId", "sequenceId");
                        parseProperty(_parentBuilder, _parentChildElement, "sha1", "sha1");
                        requestBuilder.addPropertyValue("parent", _parentBuilder.getBeanDefinition());
                    }
                }
                parseProperty(requestBuilder, requestChildElement, "newParentId", "newParentId");
                parseProperty(requestBuilder, requestChildElement, "newName", "newName");
                builder.addPropertyValue("request", requestBuilder.getBeanDefinition());
            }
        }
        parseProperty(builder, element, "accessTokenId");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
