
package org.mule.modules.box.processors;

import java.util.regex.Pattern;
import javax.annotation.Generated;
import org.mule.modules.box.oauth.BoxConnectorOAuthManager;
import org.mule.security.oauth.processor.BaseOAuth2AuthorizeMessageProcessor;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-03T12:16:48-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class AuthorizeMessageProcessor
    extends BaseOAuth2AuthorizeMessageProcessor<BoxConnectorOAuthManager>
{

    private final static Pattern AUTH_CODE_PATTERN = Pattern.compile("code=([^&]+)");

    @Override
    protected String getAuthCodeRegex() {
        return AUTH_CODE_PATTERN.pattern();
    }

    @Override
    protected Class<BoxConnectorOAuthManager> getOAuthManagerClass() {
        return BoxConnectorOAuthManager.class;
    }

}
