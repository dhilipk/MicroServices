package com.mytrip.flight.fare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FlightFareServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightFareServiceApplication.class, args);
	}
}
