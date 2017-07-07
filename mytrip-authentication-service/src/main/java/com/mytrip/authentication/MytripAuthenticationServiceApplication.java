package com.mytrip.authentication;

import java.security.Principal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytrip.authentication.access.User;
import com.mytrip.authentication.access.UserRepository;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableResourceServer
public class MytripAuthenticationServiceApplication {

    private static final Log logger = LogFactory.getLog(MytripAuthenticationServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MytripAuthenticationServiceApplication.class, args);
    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        logger.info("AS /user has been called");
        logger.debug("user info: " + user.toString());
        return user;
    }


    @Bean
    public CommandLineRunner populateCustomerData(UserRepository repository) {
        return args -> {
            User user = new User();
            user.setUsername("dhilip");
            user.setPassword("pass");
            user.setEnabled(true);
            // Saves Predefined admin user to MyTrip Application
            if(repository.findOneByUsername("dhilip") == null) {
                repository.save(user);
            }
        };
    }
}
