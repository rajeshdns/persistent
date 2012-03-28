/**
 * Mule Box.Net Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.boxnet;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.codec.Base64Decoder;

/**
 * @author MuleSoft, Inc.
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class BoxUtils {

	private static final String TARGET_FILE = "file";
	private static final String TARGET_FOLDER = "folder";
	
	public static void validateTarget(String target) {
    	if (!(TARGET_FILE.equals(target) || TARGET_FOLDER.equals(target))) {
    		throw new IllegalArgumentException("invalid target argument was provided. Valid values are " + TARGET_FILE + " and " + TARGET_FOLDER);
    	}
    }
    
    public static String decodeBase64(String encoded, String encoding) {
    	try {
    		return new String((byte[]) new Base64Decoder().doTransform(encoded, encoding));
    	} catch (TransformerException e) {
    		throw new RuntimeException("Error decoding Base64 value");
    	}
    }
}
