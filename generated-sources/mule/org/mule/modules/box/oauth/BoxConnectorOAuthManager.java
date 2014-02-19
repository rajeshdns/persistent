
package org.mule.modules.box.oauth;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;
import org.apache.commons.pool.KeyedPoolableObjectFactory;
import org.mule.DefaultMuleMessage;
import org.mule.api.MuleMessage;
import org.mule.api.expression.ExpressionManager;
import org.mule.api.store.ObjectStore;
import org.mule.modules.box.BoxConnector;
import org.mule.modules.box.adapters.BoxConnectorOAuth2Adapter;
import org.mule.security.oauth.BaseOAuth2Manager;
import org.mule.security.oauth.OAuth2Adapter;
import org.mule.security.oauth.OAuth2Manager;
import org.mule.security.oauth.OnNoTokenPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * A {@code BoxConnectorOAuthManager} is a wrapper around {@link BoxConnector } that adds access token management capabilities to the pojo.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-19T08:18:38-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class BoxConnectorOAuthManager
    extends BaseOAuth2Manager<OAuth2Adapter>
{

    private static Logger logger = LoggerFactory.getLogger(BoxConnectorOAuthManager.class);
    private final static String MODULE_NAME = "Box";
    private final static String MODULE_VERSION = "2.5.3-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.5.0-cascade";
    private final static String DEVKIT_BUILD = "UNNAMED.1791.ad9d188";

    @Override
    protected Logger getLogger() {
        return logger;
    }

    /**
     * Sets baseUrl
     * 
     * @param scope to set
     */
    public void setBaseUrl(String value) {
        BoxConnectorOAuth2Adapter connector = ((BoxConnectorOAuth2Adapter) this.getDefaultUnauthorizedConnector());
        connector.setBaseUrl(value);
    }

    /**
     * Retrieves baseUrl
     * 
     */
    public String getBaseUrl() {
        BoxConnectorOAuth2Adapter connector = ((BoxConnectorOAuth2Adapter) this.getDefaultUnauthorizedConnector());
        return connector.getBaseUrl();
    }

    /**
     * Sets uploadUrl
     * 
     * @param scope to set
     */
    public void setUploadUrl(String value) {
        BoxConnectorOAuth2Adapter connector = ((BoxConnectorOAuth2Adapter) this.getDefaultUnauthorizedConnector());
        connector.setUploadUrl(value);
    }

    /**
     * Retrieves uploadUrl
     * 
     */
    public String getUploadUrl() {
        BoxConnectorOAuth2Adapter connector = ((BoxConnectorOAuth2Adapter) this.getDefaultUnauthorizedConnector());
        return connector.getUploadUrl();
    }

    /**
     * Sets clientId
     * 
     * @param key to set
     */
    public void setClientId(String value) {
        super.setConsumerKey(value);
    }

    /**
     * Sets clientSecret
     * 
     * @param secret to set
     */
    public void setClientSecret(String value) {
        super.setConsumerSecret(value);
    }

    /**
     * Sets useGzip
     * 
     * @param scope to set
     */
    public void setUseGzip(boolean value) {
        BoxConnectorOAuth2Adapter connector = ((BoxConnectorOAuth2Adapter) this.getDefaultUnauthorizedConnector());
        connector.setUseGzip(value);
    }

    /**
     * Retrieves useGzip
     * 
     */
    public boolean getUseGzip() {
        BoxConnectorOAuth2Adapter connector = ((BoxConnectorOAuth2Adapter) this.getDefaultUnauthorizedConnector());
        return connector.getUseGzip();
    }

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

    @Override
    protected OAuth2Adapter instantiateAdapter() {
        return new BoxConnectorOAuth2Adapter(this);
    }

    @Override
    protected KeyedPoolableObjectFactory createPoolFactory(OAuth2Manager<OAuth2Adapter> oauthManager, ObjectStore<Serializable> objectStore) {
        return new BoxConnectorOAuthClientFactory(oauthManager, objectStore);
    }

    @Override
    protected void setCustomProperties(OAuth2Adapter adapter) {
        BoxConnectorOAuth2Adapter connector = ((BoxConnectorOAuth2Adapter) adapter);
        connector.setBaseUrl(getBaseUrl());
        connector.setUploadUrl(getUploadUrl());
        connector.setClientId(getConsumerKey());
        connector.setClientSecret(getConsumerSecret());
        connector.setUseGzip(getUseGzip());
    }

    protected void fetchCallbackParameters(OAuth2Adapter adapter, String response) {
        BoxConnectorOAuth2Adapter connector = ((BoxConnectorOAuth2Adapter) adapter);
        ExpressionManager expressionManager = (muleContext.getExpressionManager());
        MuleMessage muleMessage = new DefaultMuleMessage(response, (muleContext));
    }

    public void setOnNoToken(OnNoTokenPolicy policy) {
        this.getDefaultUnauthorizedConnector().setOnNoTokenPolicy(policy);
    }

    @Override
    protected Set<Class<? extends Exception>> refreshAccessTokenOn() {
        Set<Class<? extends Exception>> types = new HashSet<Class<? extends Exception>>();
        types.add((org.mule.modules.box.exception.BoxTokenExpiredException.class));
        return types;
    }

}
