package com.mytrip.support;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.mytrip.support.entity.City;
import com.mytrip.support.entity.DestinationCityMapping;
import com.mytrip.support.enums.CityCategory;
import com.mytrip.support.repository.CityRepository;
import com.mytrip.support.repository.DestinationCityMappingRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class SupportServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(SupportServiceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SupportServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner populateData(CityRepository repository, DestinationCityMappingRepository repo) {
		return (args) -> {
			City chennai = new City("Chennai", "Chennai International Airport", "MAA", "India", CityCategory.TOP_CITIES);
			City madurai = new City("Madurai", "Madurai International Airport", "IXM", "India", CityCategory.TIER2);
			City bangalore = new City("Bangalore", "Bengaluru International Airport", "BLR", "India", CityCategory.TOP_CITIES);
			City pune = new City("Pune", "Pune Airport", "PNQ", "India", CityCategory.TIER1);
			repository.save(chennai);
			repository.save(madurai);
			repository.save(bangalore);
			repository.save(pune);
			
			// fetch all cities
			log.info("Cities found with findAll():");
			log.info("-------------------------------");
			for (City city : repository.findAll()) {
				log.info(city.toString());
			}
			log.info("");
			List<DestinationCityMapping> cityMapping = new ArrayList<>();
			cityMapping.add(new DestinationCityMapping(chennai, pune));
			cityMapping.add(new DestinationCityMapping(chennai, madurai));
			cityMapping.add(new DestinationCityMapping(chennai, bangalore));
			cityMapping.add(new DestinationCityMapping(madurai, chennai));
			cityMapping.add(new DestinationCityMapping(bangalore, chennai));
			cityMapping.add(new DestinationCityMapping(bangalore, pune));
			cityMapping.add(new DestinationCityMapping(pune, bangalore));
			repo.save(cityMapping);
			// fetch all mapped cities
			log.info("Destination Cities found with findAll():");
			log.info("-------------------------------");
			for (DestinationCityMapping destinationCityMapping : repo.findAll()) {
				log.info(destinationCityMapping.toString());
			}
			log.info("");
		}; 
	}
}
