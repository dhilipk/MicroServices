package com.mytrip.customer.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CustomerInformationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerInformationServiceApplication.class, args);
	}
}
