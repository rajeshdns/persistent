
package org.mule.modules.box.config;

import javax.annotation.Generated;
import org.mule.modules.box.oauth.BoxConnectorOAuthManager;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-03T12:16:48-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class BoxConnectorConfigDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(BoxConnectorOAuthManager.class.getName());
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        setInitMethodIfNeeded(builder, BoxConnectorOAuthManager.class);
        setDestroyMethodIfNeeded(builder, BoxConnectorOAuthManager.class);
        parseProperty(builder, element, "baseUrl", "baseUrl");
        parseProperty(builder, element, "uploadUrl", "uploadUrl");
        parseProperty(builder, element, "clientId", "clientId");
        parseProperty(builder, element, "clientSecret", "clientSecret");
        parseProperty(builder, element, "useGzip", "useGzip");
        parseProperty(builder, element, "name", "name");
        parseProperty(builder, element, "authorizationUrl");
        parseProperty(builder, element, "accessTokenUrl");
        parseProperty(builder, element, "onNoToken");
        Element httpCallbackConfigElement = DomUtils.getChildElementByTagName(element, "oauth-callback-config");
        if (httpCallbackConfigElement!= null) {
            parseProperty(builder, httpCallbackConfigElement, "domain");
            parseProperty(builder, httpCallbackConfigElement, "localPort");
            parseProperty(builder, httpCallbackConfigElement, "remotePort");
            parseProperty(builder, httpCallbackConfigElement, "async");
            parseProperty(builder, httpCallbackConfigElement, "path");
            parseProperty(builder, httpCallbackConfigElement, "defaultAccessTokenId");
            if (hasAttribute(httpCallbackConfigElement, "connector-ref")) {
                builder.addPropertyValue("connector", new RuntimeBeanReference(httpCallbackConfigElement.getAttribute("connector-ref")));
            }
        }
        Element oauthStoreConfigElement = DomUtils.getChildElementByTagName(element, "oauth-store-config");
        if (oauthStoreConfigElement!= null) {
            parsePropertyRef(builder, oauthStoreConfigElement, "objectStore-ref", "accessTokenObjectStore");
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        return definition;
    }

}
