/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.model;


/**
 * When something changes in a user’s Box account, either in folders they own or folders they collaborate on, Box logs an 'event' for the user.
 * Box's /events endpoint is focused on delivering to you a low latency, highly reliable list of all the events relevant to your Box account.
 * Events are registered against a time-sequenced list called the streamPosition. When you do a GET against /events API and pass in a streamPosition Box
 * responds to you with the events that happened slightly before that stream position, up to the current streamPosition, or the chunkSize, whichever is lesser.
 * Due to timing lag across Box's multiple datacenters, and our preference of low-latency and insurance to make sure you don’t miss some event,
 * you may receive duplicate events when you call the /events API. You should use the eventId field in each returned event to check for duplicate events
 * and discard ones that you have already processed. You may also receive events that are 'before' events that you’ve already received by roughly 5-15 seconds.
 * This is simply due to the variability in when events get recorded, and Box's preference for delivering events to you as soon as they know about them.
 * 
 * @author mariano.gonzalez@mulesoft.com
 */
public class Event extends Entity {

	private static final long serialVersionUID = -6515021079291400859L;

	/**
	 * The id of the event, used for de-duplication purposes
	 */
	private String eventId;
	
	/**
	 * The time when the event was created
	 */
	private String createdAt;
	
	/**
	 * The time when the event was recorded
	 */
	private String recordedAt;
	
	
	/**
	 * The type of event
	 */
	private String eventType;
	
	/**
	 * The session of the user that performed the action
	 */
	private String sessionId;
	
	/**
	 * The object that was modified. See Object definitions for appropriate object: file, folder, comment, etc.
	 * Not all events have a source object.
	 */
	private Entity source;
	
	private User createdBy;
	
	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getRecordedAt() {
		return recordedAt;
	}

	public void setRecordedAt(String recordedAt) {
		this.recordedAt = recordedAt;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Entity getSource() {
		return source;
	}

	public void setSource(Entity source) {
		this.source = source;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
}
