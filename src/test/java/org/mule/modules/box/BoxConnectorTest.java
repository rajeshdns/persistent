/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box;

import java.io.InputStream;

import junit.framework.Assert;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.mule.api.MessagingException;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.construct.Flow;
import org.mule.modules.box.model.Folder;
import org.mule.modules.box.model.FolderItems;
import org.mule.modules.box.model.response.UploadFileResponse;
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
	
	@Test
	public void getFolders() throws Exception {
		Folder folder = (Folder) this.callFlow("", "testListFolders").getPayload();
		Assert.assertEquals(folder.getId(), "0");
	}
	
	@Test
	public void createAndCopyFolder() throws Exception {
		final String name = "My mule connector folder";
		Folder folder = (Folder) this.callFlow(name, "testCreateFolder").getPayload();
		Assert.assertEquals(folder.getName(), name);
		Assert.assertEquals(folder.getParent().getId(), "0");
		
		MuleMessage response = this.callFlow(folder, "testCopyFolder");
		Folder copiedFolder = (Folder) response.getPayload();
		Folder targetFolder = (Folder) response.getInvocationProperty("targetFolder");
		
		this.callFlow(folder.getId(), "testDeleteFolder");
		this.callFlow(copiedFolder.getId(), "testDeleteFolder");
		this.callFlow(targetFolder.getId(), "testDeleteFolder");
	}
	
	@Test
	public void listFolder() throws Exception {
		FolderItems items = (FolderItems) this.callFlow("", "testListFolder").getPayload();
		Assert.assertTrue(items.getTotalCount() > 0);
	}
	
	@Test
	public void upload() throws Exception {
		InputStream in = this.getClass().getResourceAsStream("/test.txt");
		assert in != null : "Could not load file";
		
		UploadFileResponse file = (UploadFileResponse) this.callFlow(in, "testUpload").getPayload();
		Assert.assertEquals(file.getTotalCount(), 1);
		Assert.assertEquals(file.getEntries().get(0).getName(), "testfile.txt");
		
		this.callFlow(file, "testDelete");
	}
	
	private MuleMessage callFlow(Object payload, String flowName) throws Exception {
		MuleEvent event = getTestEvent(payload);
		Flow flow = (Flow) getFlowConstruct(flowName);
		MuleEvent response = flow.process(event);
		
		return response.getMessage();
		
	}

}
