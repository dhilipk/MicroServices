package com.mytrip.flight.checkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FlightCheckinServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightCheckinServiceApplication.class, args);
	}
}
