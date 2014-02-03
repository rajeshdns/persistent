
package org.mule.modules.box.model.holders;

import javax.annotation.Generated;
import org.mule.modules.box.model.Collaboration.CollaborationStatus;
import org.mule.modules.box.model.Item;
import org.mule.modules.box.model.User;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-03T12:16:48-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class CollaborationExpressionHolder
    extends EntityExpressionHolder
{

    protected Object createdBy;
    protected User _createdByType;
    protected Object createdAt;
    protected String _createdAtType;
    protected Object modifiedAt;
    protected String _modifiedAtType;
    protected Object expiresAt;
    protected String _expiresAtType;
    protected Object status;
    protected CollaborationStatus _statusType;
    protected Object accessibleBy;
    protected User _accessibleByType;
    protected Object role;
    protected String _roleType;
    protected Object acknowledgedAt;
    protected String _acknowledgedAtType;
    protected Object item;
    protected Item _itemType;

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

    /**
     * Sets expiresAt
     * 
     * @param value Value to set
     */
    public void setExpiresAt(Object value) {
        this.expiresAt = value;
    }

    /**
     * Retrieves expiresAt
     * 
     */
    public Object getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * Sets status
     * 
     * @param value Value to set
     */
    public void setStatus(Object value) {
        this.status = value;
    }

    /**
     * Retrieves status
     * 
     */
    public Object getStatus() {
        return this.status;
    }

    /**
     * Sets accessibleBy
     * 
     * @param value Value to set
     */
    public void setAccessibleBy(Object value) {
        this.accessibleBy = value;
    }

    /**
     * Retrieves accessibleBy
     * 
     */
    public Object getAccessibleBy() {
        return this.accessibleBy;
    }

    /**
     * Sets role
     * 
     * @param value Value to set
     */
    public void setRole(Object value) {
        this.role = value;
    }

    /**
     * Retrieves role
     * 
     */
    public Object getRole() {
        return this.role;
    }

    /**
     * Sets acknowledgedAt
     * 
     * @param value Value to set
     */
    public void setAcknowledgedAt(Object value) {
        this.acknowledgedAt = value;
    }

    /**
     * Retrieves acknowledgedAt
     * 
     */
    public Object getAcknowledgedAt() {
        return this.acknowledgedAt;
    }

    /**
     * Sets item
     * 
     * @param value Value to set
     */
    public void setItem(Object value) {
        this.item = value;
    }

    /**
     * Retrieves item
     * 
     */
    public Object getItem() {
        return this.item;
    }

}
