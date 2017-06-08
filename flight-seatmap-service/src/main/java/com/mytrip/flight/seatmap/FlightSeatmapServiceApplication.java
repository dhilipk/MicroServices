package com.mytrip.flight.seatmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FlightSeatmapServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightSeatmapServiceApplication.class, args);
	}
}
