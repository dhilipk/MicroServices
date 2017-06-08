package com.mytrip.travel.information;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TravelScheduleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelScheduleServiceApplication.class, args);
	}
}
