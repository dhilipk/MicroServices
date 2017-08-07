package com.mytrip.authentication.token;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.AuthenticationKeyGenerator;
import org.springframework.security.oauth2.provider.token.DefaultAuthenticationKeyGenerator;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.stereotype.Component;

@Component
public class TokenStoreService implements TokenStore {

    @Autowired
    private MongoTemplate mongoTemplate;

    private final AuthenticationKeyGenerator authenticationKeyGenerator = new DefaultAuthenticationKeyGenerator();

    @Override
    public Collection<OAuth2AccessToken> findTokensByClientId(String clientId) {

        return null;
    }

    @Override
	public Collection<OAuth2AccessToken> findTokensByClientIdAndUserName(String clientId, String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OAuth2AccessToken getAccessToken(OAuth2Authentication authentication) {
        String authenticationId = authenticationKeyGenerator.extractKey(authentication);
        if (null == authenticationId) {
            return null;
        }
        Query query = new Query();
        query.addCriteria(Criteria.where("authenticationId").is(authenticationId));
        /*OAuth2AuthenticationAccessToken token = mongoTemplate.findOne(query, OAuth2AuthenticationAccessToken.class, "oauth2_access_token");
        return token == null ? null : token.getoAuth2AccessToken();*/
        return null;
	}

	@Override
	public OAuth2AccessToken readAccessToken(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OAuth2Authentication readAuthentication(OAuth2AccessToken arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OAuth2Authentication readAuthentication(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OAuth2Authentication readAuthenticationForRefreshToken(OAuth2RefreshToken arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OAuth2RefreshToken readRefreshToken(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAccessToken(OAuth2AccessToken arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAccessTokenUsingRefreshToken(OAuth2RefreshToken arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeRefreshToken(OAuth2RefreshToken arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void storeAccessToken(OAuth2AccessToken arg0, OAuth2Authentication arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void storeRefreshToken(OAuth2RefreshToken arg0, OAuth2Authentication arg1) {
		// TODO Auto-generated method stub

	}

}
