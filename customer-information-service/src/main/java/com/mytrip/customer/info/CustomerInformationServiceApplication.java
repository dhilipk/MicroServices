package com.mytrip.customer.info;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.mytrip.customer.info.entity.Customer;
import com.mytrip.customer.info.repository.CustomerRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class CustomerInformationServiceApplication {

    @Bean
    public CommandLineRunner populateCustomerData(CustomerRepository repository) {
        return args -> {

            // Saves Predefined  admin customers to MyTrip Application
            if(repository.findByFirstNameAndLastName("Admin", "Admin") == null) {
                repository.save(new Customer("Admin", "Admin"));
            }
            if(repository.findByFirstNameAndLastName("dhilipk", "dhilipk") == null) {
                repository.save(new Customer("dhilipk", "dhilipk"));
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomerInformationServiceApplication.class, args);
    }
}
