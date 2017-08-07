package com.mytrip.customer.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerNotificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerNotificationServiceApplication.class, args);
    }
}
