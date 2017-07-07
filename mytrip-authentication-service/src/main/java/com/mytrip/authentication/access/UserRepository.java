package com.mytrip.authentication.access;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>{

    User findOneByUsername(String username);

}
