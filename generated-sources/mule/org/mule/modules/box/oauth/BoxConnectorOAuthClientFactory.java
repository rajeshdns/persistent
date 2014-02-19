
package org.mule.modules.box.oauth;

import java.io.Serializable;
import javax.annotation.Generated;
import org.mule.api.store.ObjectStore;
import org.mule.common.security.oauth.OAuthState;
import org.mule.modules.box.adapters.BoxConnectorOAuth2Adapter;
import org.mule.security.oauth.BaseOAuthClientFactory;
import org.mule.security.oauth.OAuth2Adapter;
import org.mule.security.oauth.OAuth2Manager;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-19T08:18:38-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class BoxConnectorOAuthClientFactory
    extends BaseOAuthClientFactory
{

    private BoxConnectorOAuthManager oauthManager;

    public BoxConnectorOAuthClientFactory(OAuth2Manager<OAuth2Adapter> oauthManager, ObjectStore<Serializable> objectStore) {
        super(oauthManager, objectStore);
        this.oauthManager = (BoxConnectorOAuthManager) oauthManager;
    }

    @Override
    protected Class<? extends OAuth2Adapter> getAdapterClass() {
        return BoxConnectorOAuth2Adapter.class;
    }

    @Override
    protected void setCustomAdapterProperties(OAuth2Adapter adapter, OAuthState state) {
        BoxConnectorOAuth2Adapter connector = ((BoxConnectorOAuth2Adapter) adapter);
        connector.setBaseUrl(oauthManager.getBaseUrl());
        connector.setUploadUrl(oauthManager.getUploadUrl());
        connector.setUseGzip(oauthManager.getUseGzip());
    }

    @Override
    protected void setCustomStateProperties(OAuth2Adapter adapter, OAuthState state) {
        BoxConnectorOAuth2Adapter connector = ((BoxConnectorOAuth2Adapter) adapter);
    }

}
