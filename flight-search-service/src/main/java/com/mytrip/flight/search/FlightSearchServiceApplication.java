package com.mytrip.flight.search;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.mytrip.flight.search.entity.Flight;
import com.mytrip.flight.search.repository.FlightRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class FlightSearchServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(FlightSearchServiceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(FlightSearchServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner populateData(FlightRepository repository) {
		return (args) -> {
			Calendar calendar = Calendar.getInstance();
			calendar.set(2017, 06, 20, 19, 30);
			Flight boing770Chennai = new Flight("6E 311", "MAA", "PNQ", calendar.getTime());
			repository.save(boing770Chennai);
			
			// fetch all Flights
			log.info("Flights found with findAll():");
			log.info("-------------------------------");
			for (Flight flight : repository.findAll()) {
				log.info(flight.toString());
			}
			log.info("");
		};
	}
}
