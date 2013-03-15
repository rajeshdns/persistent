/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box.exception;


/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class BoxException extends RuntimeException {

	private static final long serialVersionUID = 7505388208908224302L;
	
	private ErrorList errors;
	private int status;
	
	public BoxException(String message) {
		super(message);
	}
	
	public BoxException(String message, Error error) {
		this(message);
		this.errors = new ErrorList().addError(error);
		this.status = error.getStatus();
	}
	
	public BoxException(String message, Error error, Throwable cause) {
		super(message, cause);
		this.errors = new ErrorList().addError(error);
		this.status = error.getStatus();
	}
	
	public BoxException(String message, ErrorList errors) {
		this(message);
		this.errors = errors;
		this.status = this.getStatus(errors);
	}
	
	public BoxException(Error error, Throwable t) {
		super(error.getMessage(), t);
		this.errors = new ErrorList().addError(error);
		this.status = error.getStatus();
	}
	
	public BoxException(String message, ErrorList errors, Throwable t) {
		super(message, t);
		this.errors = errors;
		this.status = this.getStatus(errors);
	}
	
	public ErrorList getErrors() {
		return errors;
	}

	public int getStatus() {
		return this.status;
	}
	
	private int getStatus(ErrorList errors) {
		return errors.getEntries().isEmpty() ? 0 : errors.getEntries().get(0).getStatus();
	}
	
}