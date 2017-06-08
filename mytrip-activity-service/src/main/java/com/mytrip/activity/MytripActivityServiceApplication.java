package com.mytrip.activity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MytripActivityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MytripActivityServiceApplication.class, args);
	}
}
