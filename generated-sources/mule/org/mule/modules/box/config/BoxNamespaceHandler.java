
package org.mule.modules.box.config;

import javax.annotation.Generated;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/box</code>.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-03T12:16:48-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class BoxNamespaceHandler
    extends NamespaceHandlerSupport
{


    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        registerBeanDefinitionParser("config", new BoxConnectorConfigDefinitionParser());
        registerBeanDefinitionParser("authorize", new AuthorizeDefinitionParser());
        registerBeanDefinitionParser("unauthorize", new UnauthorizeDefinitionParser());
        registerBeanDefinitionParser("get-folder", new GetFolderDefinitionParser());
        registerBeanDefinitionParser("create-folder", new CreateFolderDefinitionParser());
        registerBeanDefinitionParser("update-folder", new UpdateFolderDefinitionParser());
        registerBeanDefinitionParser("get-folder-discussions", new GetFolderDiscussionsDefinitionParser());
        registerBeanDefinitionParser("get-trashed-items", new GetTrashedItemsDefinitionParser());
        registerBeanDefinitionParser("restore-trashed-folder", new RestoreTrashedFolderDefinitionParser());
        registerBeanDefinitionParser("perm-delete-folder", new PermDeleteFolderDefinitionParser());
        registerBeanDefinitionParser("get-trashed-folder", new GetTrashedFolderDefinitionParser());
        registerBeanDefinitionParser("share-folder", new ShareFolderDefinitionParser());
        registerBeanDefinitionParser("unshare-folder", new UnshareFolderDefinitionParser());
        registerBeanDefinitionParser("copy-folder", new CopyFolderDefinitionParser());
        registerBeanDefinitionParser("get-folder-items", new GetFolderItemsDefinitionParser());
        registerBeanDefinitionParser("get-folder-item", new GetFolderItemDefinitionParser());
        registerBeanDefinitionParser("get-item-by-path", new GetItemByPathDefinitionParser());
        registerBeanDefinitionParser("get-folder-by-path", new GetFolderByPathDefinitionParser());
        registerBeanDefinitionParser("delete-folder", new DeleteFolderDefinitionParser());
        registerBeanDefinitionParser("upload-stream", new UploadStreamDefinitionParser());
        registerBeanDefinitionParser("upload-new-version-stream", new UploadNewVersionStreamDefinitionParser());
        registerBeanDefinitionParser("upload-new-version-path", new UploadNewVersionPathDefinitionParser());
        registerBeanDefinitionParser("download", new DownloadDefinitionParser());
        registerBeanDefinitionParser("get-file-metadata", new GetFileMetadataDefinitionParser());
        registerBeanDefinitionParser("get-versions-metadata", new GetVersionsMetadataDefinitionParser());
        registerBeanDefinitionParser("upload-path", new UploadPathDefinitionParser());
        registerBeanDefinitionParser("delete-file", new DeleteFileDefinitionParser());
        registerBeanDefinitionParser("update-file", new UpdateFileDefinitionParser());
        registerBeanDefinitionParser("copy-file", new CopyFileDefinitionParser());
        registerBeanDefinitionParser("share-file", new ShareFileDefinitionParser());
        registerBeanDefinitionParser("unshare-file", new UnshareFileDefinitionParser());
        registerBeanDefinitionParser("get-file-comments", new GetFileCommentsDefinitionParser());
        registerBeanDefinitionParser("get-file-thumbnail", new GetFileThumbnailDefinitionParser());
        registerBeanDefinitionParser("get-trashed-file", new GetTrashedFileDefinitionParser());
        registerBeanDefinitionParser("restore-trashed-file", new RestoreTrashedFileDefinitionParser());
        registerBeanDefinitionParser("perm-delete-file", new PermDeleteFileDefinitionParser());
        registerBeanDefinitionParser("get-comment", new GetCommentDefinitionParser());
        registerBeanDefinitionParser("comment-file", new CommentFileDefinitionParser());
        registerBeanDefinitionParser("update-comment", new UpdateCommentDefinitionParser());
        registerBeanDefinitionParser("delete-comment", new DeleteCommentDefinitionParser());
        registerBeanDefinitionParser("create-discussion", new CreateDiscussionDefinitionParser());
        registerBeanDefinitionParser("comment-discussion", new CommentDiscussionDefinitionParser());
        registerBeanDefinitionParser("get-discussion", new GetDiscussionDefinitionParser());
        registerBeanDefinitionParser("update-discussion", new UpdateDiscussionDefinitionParser());
        registerBeanDefinitionParser("get-discussion-comments", new GetDiscussionCommentsDefinitionParser());
        registerBeanDefinitionParser("create-collaboration", new CreateCollaborationDefinitionParser());
        registerBeanDefinitionParser("update-collaboration", new UpdateCollaborationDefinitionParser());
        registerBeanDefinitionParser("delete-collaboration", new DeleteCollaborationDefinitionParser());
        registerBeanDefinitionParser("get-collaboration", new GetCollaborationDefinitionParser());
        registerBeanDefinitionParser("get-pending-collaborations", new GetPendingCollaborationsDefinitionParser());
        registerBeanDefinitionParser("get-user", new GetUserDefinitionParser());
        registerBeanDefinitionParser("get-users", new GetUsersDefinitionParser());
        registerBeanDefinitionParser("update-user", new UpdateUserDefinitionParser());
        registerBeanDefinitionParser("create-user", new CreateUserDefinitionParser());
        registerBeanDefinitionParser("move-folder-to-user", new MoveFolderToUserDefinitionParser());
        registerBeanDefinitionParser("delete-user", new DeleteUserDefinitionParser());
        registerBeanDefinitionParser("create-email-alias", new CreateEmailAliasDefinitionParser());
        registerBeanDefinitionParser("delete-email-alias", new DeleteEmailAliasDefinitionParser());
        registerBeanDefinitionParser("change-primary-login", new ChangePrimaryLoginDefinitionParser());
        registerBeanDefinitionParser("get-email-aliases", new GetEmailAliasesDefinitionParser());
        registerBeanDefinitionParser("get-events", new GetEventsDefinitionParser());
        registerBeanDefinitionParser("get-enterprise-events", new GetEnterpriseEventsDefinitionParser());
        registerBeanDefinitionParser("get-events-long-polling-server", new GetEventsLongPollingServerDefinitionParser());
        registerBeanDefinitionParser("search", new SearchDefinitionParser());
        registerBeanDefinitionParser("listen-events", new ListenEventsDefinitionParser());
    }

}
