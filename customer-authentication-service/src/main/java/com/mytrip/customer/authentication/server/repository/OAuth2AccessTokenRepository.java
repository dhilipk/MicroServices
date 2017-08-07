package com.mytrip.customer.authentication.server.repository;

import java.io.Serializable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mytrip.customer.authentication.server.model.OAuth2AuthenticationAccessToken;

public interface OAuth2AccessTokenRepository extends MongoRepository<OAuth2AuthenticationAccessToken, Serializable> {

}
