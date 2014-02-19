
package org.mule.modules.box.model.holders;

import javax.annotation.Generated;
import org.mule.modules.box.model.Item;
import org.mule.modules.box.model.User;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-19T08:18:38-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class DiscussionExpressionHolder
    extends EntityExpressionHolder
{

    protected Object parent;
    protected Item _parentType;
    protected Object description;
    protected String _descriptionType;
    protected Object createdBy;
    protected User _createdByType;
    protected Object createdAt;
    protected String _createdAtType;
    protected Object modifiedAt;
    protected String _modifiedAtType;

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
     * Sets createdBy
     * 
     * @param value Value to set
     */
    public void setCreatedBy(Object value) {
        this.createdBy = value;
    }

    /**
     * Retrieves createdBy
     * 
     */
    public Object getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Sets createdAt
     * 
     * @param value Value to set
     */
    public void setCreatedAt(Object value) {
        this.createdAt = value;
    }

    /**
     * Retrieves createdAt
     * 
     */
    public Object getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Sets modifiedAt
     * 
     * @param value Value to set
     */
    public void setModifiedAt(Object value) {
        this.modifiedAt = value;
    }

    /**
     * Retrieves modifiedAt
     * 
     */
    public Object getModifiedAt() {
        return this.modifiedAt;
    }

}
