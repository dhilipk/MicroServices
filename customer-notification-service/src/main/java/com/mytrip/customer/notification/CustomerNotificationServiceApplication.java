package com.mytrip.customer.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CustomerNotificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerNotificationServiceApplication.class, args);
    }
}
