/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.modules.box;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class MerloTest extends FunctionalTestCase {
	
	@Override
	protected String getConfigResources() {
		return "merlo.xml";
	}
	
	@Test
	public void merlo() throws Exception {
//		ObjectStore<BoxConnectorOAuthState> os = muleContext.getRegistry().lookupObject(MuleProperties.OBJECT_STORE_DEFAULT_IN_MEMORY_NAME);
//		
//		BoxConnectorOAuthState state = new BoxConnectorOAuthState();
//		
//		state.setAccessToken("ZmmYtvGfu0WyfIu7ONNMDEMUhkXOPizv");
//		state.setAuthorizationUrl("https://api.box.com/oauth2/authorize");
//		state.setAccessTokenUrl("https://api.box.com/oauth2/token");
//		state.setRefreshToken("495RUCVODo4vSt4Sqjg0710zdRb74N6szbXlBmbXDYEFEMVejtn9aAt9qHZf9quv");
//		
//		os.store("merlo", state);
//		
//		Flow flow = (Flow) muleContext.getRegistry().lookupFlowConstruct("merlo");
//		flow.process(getTestEvent(""));
	}
}
