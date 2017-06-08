package com.mytrip.flight.status;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FlightStatusServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightStatusServiceApplication.class, args);
	}
}
