/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;


/**
 *
 * Comments are messages generated by Box users.
 * Each message is tied to specific files or discussions.
 * You can create comments independently or create them as responses to other comments.
 * 
 * @author mariano.gonzalez@mulesoft.com
 */
public class Comment extends Entity {

	private static final long serialVersionUID = 7670402222846957689L;
	
	/**
	 * Whether or not this comment is a reply to another comment
	 */
	private Boolean isReplyComment;
	
	/**
	 * The comment text that the user typed
	 */
	private String message;
	
	/**
	 * The string representing the comment text with @mentions included.
	 * @mention format is @[id:username]. Field is not included by default.
	 */
	private String taggedMessage;
	
	/**
	 *  object representing the author of the comment
	 */
	private User createdBy;
	
	/**
	 * The time this comment was created
	 */
	private String createdAt;
	
	/**
	 * The object this comment was placed on
	 */
	private Item item;
	
	/**
	 * The time this comment was last modified
	 */
	private String modifiedAt;
	
	public Boolean isReplyComment() {
		return isReplyComment;
	}
	public void setReplyComment(Boolean isReplyComment) {
		this.isReplyComment = isReplyComment;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	public String getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	
	public String getTaggedMessage() {
		return taggedMessage;
	}
	public void setTaggedMessage(String taggedMessage) {
		this.taggedMessage = taggedMessage;
	}
}
