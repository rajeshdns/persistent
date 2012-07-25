/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.boxnet;

import org.mule.DefaultMuleEvent;
import org.mule.MessageExchangePattern;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.construct.Flow;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class FlowUtils {

	public static MuleMessage callFlow(String flowName, MuleMessage message) {
		return callFlow(getFlow(flowName, message.getMuleContext()), message);
	}
	
	public static Flow getFlow(String flowName, MuleContext muleContext) {
		return (Flow) muleContext.getRegistry().lookupFlowConstruct(flowName);
	}
	
	public static MuleMessage callFlow(Flow flow, MuleMessage message) {
		MuleEvent event = new DefaultMuleEvent(message, MessageExchangePattern.REQUEST_RESPONSE, flow);
		try {
			return flow.process(event).getMessage();
		} catch (MuleException e) {
			throw new RuntimeException(e);
		}
	}
}
