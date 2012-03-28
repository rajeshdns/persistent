/**
 * Mule Box.Net Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.boxnet.callback;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.net.URLCodec;
import org.mule.api.MuleMessage;

/**
 * Simplyfied version of {@link org.mule.transport.http.transformers.HttpRequestBodyToParamMap} to avoid
 * dependencies. Functionality is trimmed since the use will be very specific
 * 
 * @author MuleSoft, Inc.
 * @author mariano.gonzalez@mulesoft.com
 */
public class HttpParamsExtractor {

	public static Map<String, String> toMap(MuleMessage message) {
		
		String queryString = null;
		try {
			queryString = new URI(message.getPayload().toString()).getRawQuery();
		} catch (URISyntaxException e) {
			throw new IllegalArgumentException(e);
		}
		
		return addQueryStringToParameterMap(queryString);
	}
	
	private static Map<String, String> addQueryStringToParameterMap(String queryString) {
        Map<String, String> retVal = new HashMap<String, String>();
        
        try {
        	for (String pair : queryString.split("&")) {
        		String[] nameValue = pair.split("=");
        		if (nameValue.length == 2) {
        			URLCodec codec = new URLCodec();
        			String key = codec.decode(nameValue[0]);
        			String value = codec.decode(nameValue[1]);
        			retVal.put(key, value);
        		}
        	}
        } catch (DecoderException e) {
        	throw new RuntimeException(e);
        }
		
		return retVal;
    }


	
}
