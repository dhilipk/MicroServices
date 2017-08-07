package com.mytrip.customer.authentication;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@ImportResource({"classpath*:spring-security-oauth2.xml"})
@EnableMongoRepositories("com.mytrip.customer.authentication.server.repository")
public class CustomerAuthenticationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerAuthenticationServiceApplication.class, args);
    }

    @Autowired
    private MongoDbFactory mongoDbFactory;

    @Bean(autowire = Autowire.BY_NAME, name = "mongoTemplate")
    public MongoTemplate customMongoTemplate() {
        try {
            return new MongoTemplate(mongoDbFactory); // a mongotemplate with custom convertor
        } catch (Exception e) {
        }
        return null;
    }
}
