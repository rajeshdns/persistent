
package org.mule.modules.box.config;

import javax.annotation.Generated;
import org.mule.modules.box.model.holders.FolderUploadEmailExpressionHolder;
import org.mule.modules.box.model.holders.ItemExpressionHolder;
import org.mule.modules.box.model.holders.PermissionsExpressionHolder;
import org.mule.modules.box.model.holders.SharedLinkExpressionHolder;
import org.mule.modules.box.model.request.holders.UpdateItemRequestExpressionHolder;
import org.mule.modules.box.processors.UpdateFileMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser.ParseDelegate;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-03T12:16:48-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class UpdateFileDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(UpdateFileMessageProcessor.class.getName());
        builder.addConstructorArgValue("updateFile");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "fileId", "fileId");
        if (!parseObjectRefWithDefault(element, builder, "request", "request", "#[payload]")) {
            BeanDefinitionBuilder requestBuilder = BeanDefinitionBuilder.rootBeanDefinition(UpdateItemRequestExpressionHolder.class.getName());
            Element requestChildElement = DomUtils.getChildElementByTagName(element, "request");
            if (requestChildElement!= null) {
                parseProperty(requestBuilder, requestChildElement, "name", "name");
                parseProperty(requestBuilder, requestChildElement, "description", "description");
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
                parseProperty(requestBuilder, requestChildElement, "parentId", "parentId");
                if (!parseObjectRef(requestChildElement, requestBuilder, "shared-link", "sharedLink")) {
                    BeanDefinitionBuilder _sharedLinkBuilder = BeanDefinitionBuilder.rootBeanDefinition(SharedLinkExpressionHolder.class.getName());
                    Element _sharedLinkChildElement = DomUtils.getChildElementByTagName(requestChildElement, "shared-link");
                    if (_sharedLinkChildElement!= null) {
                        parseProperty(_sharedLinkBuilder, _sharedLinkChildElement, "access", "access");
                        parseProperty(_sharedLinkBuilder, _sharedLinkChildElement, "passwordEnabled", "passwordEnabled");
                        parseProperty(_sharedLinkBuilder, _sharedLinkChildElement, "url", "url");
                        parseProperty(_sharedLinkBuilder, _sharedLinkChildElement, "downloadUrl", "downloadUrl");
                        parseProperty(_sharedLinkBuilder, _sharedLinkChildElement, "vanityUrl", "vanityUrl");
                        parseProperty(_sharedLinkBuilder, _sharedLinkChildElement, "previewCount", "previewCount");
                        parseProperty(_sharedLinkBuilder, _sharedLinkChildElement, "downloadCount", "downloadCount");
                        parseProperty(_sharedLinkBuilder, _sharedLinkChildElement, "unsharedAt", "unsharedAt");
                        if (!parseObjectRef(_sharedLinkChildElement, _sharedLinkBuilder, "permissions", "permissions")) {
                            BeanDefinitionBuilder __permissionsBuilder = BeanDefinitionBuilder.rootBeanDefinition(PermissionsExpressionHolder.class.getName());
                            Element __permissionsChildElement = DomUtils.getChildElementByTagName(_sharedLinkChildElement, "permissions");
                            if (__permissionsChildElement!= null) {
                                parseProperty(__permissionsBuilder, __permissionsChildElement, "preview", "preview");
                                parseProperty(__permissionsBuilder, __permissionsChildElement, "download", "download");
                                _sharedLinkBuilder.addPropertyValue("permissions", __permissionsBuilder.getBeanDefinition());
                            }
                        }
                        requestBuilder.addPropertyValue("sharedLink", _sharedLinkBuilder.getBeanDefinition());
                    }
                }
                parseProperty(requestBuilder, requestChildElement, "access", "access");
                parseProperty(requestBuilder, requestChildElement, "unsharedAt", "unsharedAt");
                if (!parseObjectRef(requestChildElement, requestBuilder, "permissions", "permissions")) {
                    BeanDefinitionBuilder _permissionsBuilder = BeanDefinitionBuilder.rootBeanDefinition(PermissionsExpressionHolder.class.getName());
                    Element _permissionsChildElement = DomUtils.getChildElementByTagName(requestChildElement, "permissions");
                    if (_permissionsChildElement!= null) {
                        parseProperty(_permissionsBuilder, _permissionsChildElement, "preview", "preview");
                        parseProperty(_permissionsBuilder, _permissionsChildElement, "download", "download");
                        requestBuilder.addPropertyValue("permissions", _permissionsBuilder.getBeanDefinition());
                    }
                }
                parseProperty(requestBuilder, requestChildElement, "canDownload", "canDownload");
                parseProperty(requestBuilder, requestChildElement, "canPreview", "canPreview");
                if (!parseObjectRef(requestChildElement, requestBuilder, "folder-upload-email", "folderUploadEmail")) {
                    BeanDefinitionBuilder _folderUploadEmailBuilder = BeanDefinitionBuilder.rootBeanDefinition(FolderUploadEmailExpressionHolder.class.getName());
                    Element _folderUploadEmailChildElement = DomUtils.getChildElementByTagName(requestChildElement, "folder-upload-email");
                    if (_folderUploadEmailChildElement!= null) {
                        parseProperty(_folderUploadEmailBuilder, _folderUploadEmailChildElement, "access", "access");
                        parseProperty(_folderUploadEmailBuilder, _folderUploadEmailChildElement, "email", "email");
                        requestBuilder.addPropertyValue("folderUploadEmail", _folderUploadEmailBuilder.getBeanDefinition());
                    }
                }
                parseListAndSetProperty(requestChildElement, requestBuilder, "tags", "tags", "tag", new ParseDelegate<String>() {


                    public String parse(Element element) {
                        return element.getTextContent();
                    }

                }
                );
                builder.addPropertyValue("request", requestBuilder.getBeanDefinition());
            }
        }
        parseProperty(builder, element, "etag", "etag");
        parseProperty(builder, element, "accessTokenId");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
