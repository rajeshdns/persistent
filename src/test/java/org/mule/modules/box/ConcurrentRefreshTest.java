package org.mule.modules.box;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.box.adapters.BoxConnectorOAuth2Adapter;
import org.mule.modules.box.oauth.RefreshTokenProcessInterceptor;
import org.mule.modules.box.process.ProcessCallback;
import org.mule.modules.box.process.ProcessInterceptor;
import org.mule.tck.junit4.FunctionalTestCase;


public class ConcurrentRefreshTest extends FunctionalTestCase {

	private final String accessTokenId = "myToken";
	private final String tokenUrl = "tokenUrl";
	
	private MessageProcessor mp;
	private MuleEvent event;
	private BoxConnectorOAuth2Adapter adapter;
	private ConcurrentProcessCallback callback;
	
	@Override
	protected String getConfigResources() {
		return "box-test-config.xml";
	}
	
	@Before
	public void setUp() throws Exception {
		mp = Mockito.mock(MessageProcessor.class);
		event = Mockito.mock(MuleEvent.class);
		adapter = Mockito.mock(BoxConnectorOAuth2Adapter.class);
		callback = new ConcurrentProcessCallback(accessTokenId);
		
		Mockito.when(adapter.getRefreshToken()).thenReturn("someRefreshToken");
		Mockito.when(adapter.getAccessTokenUrl()).thenReturn(tokenUrl);
	}
	
	@Test
	public void concurrentRefresh() throws Exception {
		final int threadCount = 100;
		
		ProcessInterceptor<String, BoxConnectorOAuth2Adapter> interceptor = new TestProcessInterceptor();
		final RefreshTokenProcessInterceptor<String> refresh = new RefreshTokenProcessInterceptor<String>(interceptor, muleContext);
		
		Mockito.doAnswer(new Answer<Void>() {
			
			@Override
			public Void answer(InvocationOnMock invocation) throws Throwable {
				callback.setRefreshed(true);
				return null;
			}
		}).when(adapter).refreshAccessToken(tokenUrl);
		
		final CountDownLatch latch = new CountDownLatch(threadCount);
		
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				try {
					refresh.execute(callback, adapter, mp, event);
					latch.countDown();
				} catch (Exception e ) {
					throw new RuntimeException(e);
				}
			}
		};
		
		for (int i = 0; i < threadCount; i++) {
			new Thread(run).start();
		}
		
		latch.await();
		
		Mockito.verify(adapter).refreshAccessToken(tokenUrl);
	}
	
	private class TestProcessInterceptor implements ProcessInterceptor<String, BoxConnectorOAuth2Adapter> {
		
		@Override
		public String execute(
				ProcessCallback<String, BoxConnectorOAuth2Adapter> callback,
				BoxConnectorOAuth2Adapter under, Filter filter,
				MuleMessage message) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String execute(
				ProcessCallback<String, BoxConnectorOAuth2Adapter> callback,
				BoxConnectorOAuth2Adapter under,
				MessageProcessor messageProcessor, MuleEvent event)
				throws Exception {
			
			callback.process(null);
			return null;
		}
	}
	
	private class ConcurrentProcessCallback extends ProcessCallback<String, BoxConnectorOAuth2Adapter> {

		private int count = 0;
		private boolean refreshed = false;
		private int successfulHits = 0;
		
		public ConcurrentProcessCallback(String accessTokenId) {
			this.setAccessTokenId(accessTokenId);
		}
		
		@Override
		public String process(BoxConnectorOAuth2Adapter object) throws Exception {
			if (!refreshed && count >= 20) {
				throw new FileNotFoundException();
			}
			count++;
			return null;
		}
		
		@Override
		public List<Class> getManagedExceptions() {
			return Arrays.asList(new Class[] {FileNotFoundException.class });
		}
		
		@Override
		public boolean isProtected() {
			return true;
		}
		
		public boolean isRefreshed() {
			return refreshed;
		}
		
		public void setRefreshed(boolean refreshed) {
			this.refreshed = refreshed;
		}
	}
}
