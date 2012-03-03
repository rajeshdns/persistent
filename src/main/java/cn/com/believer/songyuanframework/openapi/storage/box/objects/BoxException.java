/**
 * Mule Box.Net Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * 
 */
package cn.com.believer.songyuanframework.openapi.storage.box.objects;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @author Jimmy
 * 
 */
public class BoxException extends Exception {

    /** . */
    private static final long serialVersionUID = -544277250203979369L;

    /** A wrapped <code>Throwable</code>. */
    private Throwable nestedException;

    /** box.net status words. */
    private String status;

    /**
     * 
     */
    public BoxException() {
        super("Error occurred when talk to box.net.");
    }

    /**
     * 
     * @param message
     *            exception message
     */
    public BoxException(String message) {
        super(message);
    }

    /**
     * 
     * @param nestedException
     *            nested exception
     */
    public BoxException(Throwable nestedException) {
        super(nestedException.getMessage());
        this.nestedException = nestedException;
    }

    /**
     * 
     * @param message
     *            exception message
     * @param nestedException
     *            nested exception
     */
    public BoxException(String message, Throwable nestedException) {
        super(message);
        this.nestedException = nestedException;
    }

    /**
     * 
     * @return nested exception
     */
    public Throwable getNestedException() {
        return nestedException;
    }

    /**
     * @return exception message
     */
    public String getMessage() {
        if (nestedException != null) {
            return super.getMessage() + " Nested exception: "
                    + nestedException.getMessage();
        } else {
            return super.getMessage();
        }
    }

    /**
     * 
     */
    public void printStackTrace() {
        super.printStackTrace();

        if (nestedException != null) {
            System.err.print("Nested exception: ");
            nestedException.printStackTrace();
        }
    }

    /**
     * @param out
     *            print stream to be output
     */
    public void printStackTrace(PrintStream out) {
        super.printStackTrace(out);

        if (nestedException != null) {
            out.println("Nested exception: ");
            nestedException.printStackTrace(out);
        }
    }

    /**
     * @param writer
     *            writer to be output
     */
    public void printStackTrace(PrintWriter writer) {
        super.printStackTrace(writer);

        if (nestedException != null) {
            writer.println("Nested exception: ");
            nestedException.printStackTrace(writer);
        }
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
