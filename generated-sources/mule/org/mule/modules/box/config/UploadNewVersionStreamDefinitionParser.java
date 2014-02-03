
package org.mule.modules.box.config;

import javax.annotation.Generated;
import org.mule.modules.box.processors.UploadNewVersionStreamMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-03T12:16:48-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class UploadNewVersionStreamDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(UploadNewVersionStreamMessageProcessor.class.getName());
        builder.addConstructorArgValue("uploadNewVersionStream");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        if (hasAttribute(element, "content-ref")) {
            if (element.getAttribute("content-ref").startsWith("#")) {
                builder.addPropertyValue("content", element.getAttribute("content-ref"));
            } else {
                builder.addPropertyValue("content", (("#[registry:"+ element.getAttribute("content-ref"))+"]"));
            }
        }
        parseProperty(builder, element, "fileId", "fileId");
        parseProperty(builder, element, "etag", "etag");
        parseProperty(builder, element, "filename", "filename");
        parseProperty(builder, element, "contentModifiedAt", "contentModifiedAt");
        parseProperty(builder, element, "accessTokenId");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
