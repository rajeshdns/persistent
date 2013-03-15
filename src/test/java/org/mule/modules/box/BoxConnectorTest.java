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

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.mule.api.MessagingException;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.construct.Flow;
import org.mule.modules.box.model.File;
import org.mule.modules.box.model.Folder;
import org.mule.modules.box.model.GetItemsResponse;
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
	
	
	// @Test
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
	
	// @Test
	public void getFolders() throws Exception {
		Folder folder = (Folder) this.callFlow("", "testListFolders").getPayload();
		Assert.assertEquals(folder.getId(), "0");
	}
	
	// @Test
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
	
	// @Test
	public void listFolder() throws Exception {
		GetItemsResponse items = (GetItemsResponse) this.callFlow("", "testListFolder").getPayload();
		Assert.assertTrue(items.getTotalCount() > 0);
	}
	
	// @Test
	public void trashed() throws Exception {
		GetItemsResponse items = (GetItemsResponse) this.callFlow("", "testTrashed").getPayload();
		Assert.assertFalse(items.getEntries().isEmpty());
	}
	
	// @Test
	public void downloadFile() throws Exception {
		InputStream test = this.getTestFile();
		InputStream downloaded = null;
		String fileId = null;
		try {
			File file = this.doUpload(test);
			fileId = file.getId();
			downloaded = (InputStream) this.callFlow(fileId, "downloadFlow").getPayload();
			String content = IOUtils.toString(downloaded);
			test = this.getTestFile(); // re read the stream which is closed at this point
			Assert.assertEquals(content, IOUtils.toString(test));
		} finally {
			IOUtils.closeQuietly(test);
			IOUtils.closeQuietly(downloaded);
			if (fileId != null) {
				this.callFlow(fileId, "testDelete");
			}
		}
	}
	
	// @Test
	public void uploadNewVersion() throws Exception {
		InputStream test = this.getTestFile();
		String fileId = null;
		try {
			File file = this.doUpload(test);
			fileId = file.getId();
			
			test = this.getTestFile(); // re read the stream which is closed at this point
			MuleEvent event = getTestEvent(test);
			event.getMessage().setInvocationProperty("fileId", fileId);
			Flow flow = (Flow) getFlowConstruct("testUploadNewVersion");
			flow.process(event);
		} finally {
			IOUtils.closeQuietly(test);
			if (fileId != null) {
				this.callFlow(fileId, "testDelete");
			}
		}

	}
	
	// @Test
	public void upload() throws Exception {
		InputStream in = this.getTestFile();
		File file = this.doUpload(in);
		Assert.assertEquals(file.getName(), "testfile.txt");
		this.callFlow(file.getId(), "testDelete");
	}
	
	// @Test
	public void subscribe() throws Exception {
		this.callFlow(null, "longPolling");
	}
	
	private File doUpload(InputStream in) throws Exception {
		return (File) this.callFlow(in, "testUpload").getPayload();
	}
	
	private InputStream getTestFile() {
		InputStream in = this.getClass().getResourceAsStream("/test.txt");
		assert in != null : "Could not load file";
		
		return in;
	}
	
	private MuleMessage callFlow(Object payload, String flowName) throws Exception {
		MuleEvent event = getTestEvent(payload);
		Flow flow = (Flow) getFlowConstruct(flowName);
		MuleEvent response = flow.process(event);
		
		return response.getMessage();
		
	}

}
