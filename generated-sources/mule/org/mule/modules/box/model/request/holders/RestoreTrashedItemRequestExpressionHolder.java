
package org.mule.modules.box.model.request.holders;

import javax.annotation.Generated;
import org.mule.modules.box.model.Item;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-19T08:18:38-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class RestoreTrashedItemRequestExpressionHolder {

    protected Object parent;
    protected Item _parentType;
    protected Object newParentId;
    protected String _newParentIdType;
    protected Object newName;
    protected String _newNameType;

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
     * Sets newParentId
     * 
     * @param value Value to set
     */
    public void setNewParentId(Object value) {
        this.newParentId = value;
    }

    /**
     * Retrieves newParentId
     * 
     */
    public Object getNewParentId() {
        return this.newParentId;
    }

    /**
     * Sets newName
     * 
     * @param value Value to set
     */
    public void setNewName(Object value) {
        this.newName = value;
    }

    /**
     * Retrieves newName
     * 
     */
    public Object getNewName() {
        return this.newName;
    }

}
