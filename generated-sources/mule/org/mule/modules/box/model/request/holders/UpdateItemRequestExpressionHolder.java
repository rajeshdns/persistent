
package org.mule.modules.box.model.request.holders;

import java.util.List;
import javax.annotation.Generated;
import org.mule.modules.box.model.Access;
import org.mule.modules.box.model.FolderUploadEmail;
import org.mule.modules.box.model.Item;
import org.mule.modules.box.model.Permissions;
import org.mule.modules.box.model.SharedLink;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-19T08:18:38-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class UpdateItemRequestExpressionHolder {

    protected Object name;
    protected String _nameType;
    protected Object description;
    protected String _descriptionType;
    protected Object parent;
    protected Item _parentType;
    protected Object parentId;
    protected String _parentIdType;
    protected Object sharedLink;
    protected SharedLink _sharedLinkType;
    protected Object access;
    protected Access _accessType;
    protected Object unsharedAt;
    protected String _unsharedAtType;
    protected Object permissions;
    protected Permissions _permissionsType;
    protected Object canDownload;
    protected Boolean _canDownloadType;
    protected Object canPreview;
    protected Boolean _canPreviewType;
    protected Object folderUploadEmail;
    protected FolderUploadEmail _folderUploadEmailType;
    protected Object tags;
    protected List<String> _tagsType;

    /**
     * Sets name
     * 
     * @param value Value to set
     */
    public void setName(Object value) {
        this.name = value;
    }

    /**
     * Retrieves name
     * 
     */
    public Object getName() {
        return this.name;
    }

    /**
     * Sets description
     * 
     * @param value Value to set
     */
    public void setDescription(Object value) {
        this.description = value;
    }

    /**
     * Retrieves description
     * 
     */
    public Object getDescription() {
        return this.description;
    }

    /**
     * Sets parent
     * 
     * @param value Value to set
     */
    public void setParent(Object value) {
        this.parent = value;
    }

    /**
     * Retrieves parent
     * 
     */
    public Object getParent() {
        return this.parent;
    }

    /**
     * Sets parentId
     * 
     * @param value Value to set
     */
    public void setParentId(Object value) {
        this.parentId = value;
    }

    /**
     * Retrieves parentId
     * 
     */
    public Object getParentId() {
        return this.parentId;
    }

    /**
     * Sets sharedLink
     * 
     * @param value Value to set
     */
    public void setSharedLink(Object value) {
        this.sharedLink = value;
    }

    /**
     * Retrieves sharedLink
     * 
     */
    public Object getSharedLink() {
        return this.sharedLink;
    }

    /**
     * Sets access
     * 
     * @param value Value to set
     */
    public void setAccess(Object value) {
        this.access = value;
    }

    /**
     * Retrieves access
     * 
     */
    public Object getAccess() {
        return this.access;
    }

    /**
     * Sets unsharedAt
     * 
     * @param value Value to set
     */
    public void setUnsharedAt(Object value) {
        this.unsharedAt = value;
    }

    /**
     * Retrieves unsharedAt
     * 
     */
    public Object getUnsharedAt() {
        return this.unsharedAt;
    }

    /**
     * Sets permissions
     * 
     * @param value Value to set
     */
    public void setPermissions(Object value) {
        this.permissions = value;
    }

    /**
     * Retrieves permissions
     * 
     */
    public Object getPermissions() {
        return this.permissions;
    }

    /**
     * Sets canDownload
     * 
     * @param value Value to set
     */
    public void setCanDownload(Object value) {
        this.canDownload = value;
    }

    /**
     * Retrieves canDownload
     * 
     */
    public Object getCanDownload() {
        return this.canDownload;
    }

    /**
     * Sets canPreview
     * 
     * @param value Value to set
     */
    public void setCanPreview(Object value) {
        this.canPreview = value;
    }

    /**
     * Retrieves canPreview
     * 
     */
    public Object getCanPreview() {
        return this.canPreview;
    }

    /**
     * Sets folderUploadEmail
     * 
     * @param value Value to set
     */
    public void setFolderUploadEmail(Object value) {
        this.folderUploadEmail = value;
    }

    /**
     * Retrieves folderUploadEmail
     * 
     */
    public Object getFolderUploadEmail() {
        return this.folderUploadEmail;
    }

    /**
     * Sets tags
     * 
     * @param value Value to set
     */
    public void setTags(Object value) {
        this.tags = value;
    }

    /**
     * Retrieves tags
     * 
     */
    public Object getTags() {
        return this.tags;
    }

}
