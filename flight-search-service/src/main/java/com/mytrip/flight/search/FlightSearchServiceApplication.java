package com.mytrip.flight.search;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.mytrip.flight.fare.FlightFareServiceClient;
import com.mytrip.flight.search.entity.Flight;
import com.mytrip.flight.search.repository.FlightRepository;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackageClasses = FlightFareServiceClient.class)
public class FlightSearchServiceApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlightSearchServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FlightSearchServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner populateData(FlightRepository repository) {
        return (args) -> {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2017, 06, 20, 19, 30);
            Flight boing770Chennai = new Flight("6E 311", "MAA", "PNQ", "29/12/2017");
            repository.save(boing770Chennai);

            // fetch all Flights
            LOGGER.info("Flights found with findAll():");
            LOGGER.info("-------------------------------");
            for (Flight flight : repository.findAll()) {
                LOGGER.info(flight.toString());
                }
            LOGGER.info("");
        };
    }
}
