package com.mytrip.customer.info.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mytrip.customer.info.entity.User;

public interface UserRepository extends MongoRepository<User, String>{

    User findOneByUsername(String username);

}
