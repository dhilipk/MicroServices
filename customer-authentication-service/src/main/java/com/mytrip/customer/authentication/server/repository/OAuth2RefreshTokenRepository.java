package com.mytrip.customer.authentication.server.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mytrip.customer.authentication.server.model.OAuth2AuthenticationRefreshToken;

public interface OAuth2RefreshTokenRepository extends MongoRepository<OAuth2AuthenticationRefreshToken, String> {

   
}