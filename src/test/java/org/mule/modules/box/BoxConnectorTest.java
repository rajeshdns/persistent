/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box;

import junit.framework.Assert;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.mule.api.MessagingException;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.construct.Flow;
import org.mule.tck.junit4.FunctionalTestCase;

/**
 * 
 * @author mariano.gonzalez@mulesoft.com
 *
 */
public class BoxConnectorTest extends FunctionalTestCase {

	@Override
	protected String getConfigResources() {
		return "box-test-config.xml";
	}
	
	
	@Test
	public void authenticate() throws Exception {
		Object t = this.callFlow("", "testGetTicket").getPayload();
		Assert.assertTrue("Ticket was not a string", t instanceof String);
		String ticket = (String) t;
		Assert.assertFalse("Ticket was blank", StringUtils.isBlank(ticket));
		
		try {
			this.callFlow(ticket.toString(), "testAuthToken");
			Assert.fail("Was expecting a not logged in error");
		} catch (MessagingException e) {
			if (e.getCause() instanceof IllegalStateException) {
				Assert.assertTrue(e.getCause().getMessage().contains(ticket));
			} else {
				throw e;
			}
		}
		
	}
	
	private MuleMessage callFlow(Object payload, String flowName) throws Exception {
		MuleEvent event = getTestEvent(payload);
		Flow flow = (Flow) getFlowConstruct(flowName);
		MuleEvent response = flow.process(event);
		
		return response.getMessage();
		
	}

}
