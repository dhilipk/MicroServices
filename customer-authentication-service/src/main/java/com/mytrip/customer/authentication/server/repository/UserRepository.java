package com.mytrip.customer.authentication.server.repository;

import java.io.Serializable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mytrip.customer.authentication.server.model.User;

public interface UserRepository extends MongoRepository<User, Serializable> {

    public User findByEmail(String email);

}
