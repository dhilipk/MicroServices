package com.mytrip.customer.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CustomerAuthenticationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerAuthenticationServiceApplication.class, args);
	}
}
