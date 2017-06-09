package com.mytrip.customer.info.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mytrip.customer.info.entity.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByFirstNameAndLastName(String firstName, String lastName);
}
