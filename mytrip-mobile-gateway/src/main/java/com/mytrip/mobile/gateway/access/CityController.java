package com.mytrip.mobile.gateway.access;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableResourceServer
public class CityController {

    private static final Logger logger = LoggerFactory.getLogger(CityController.class);

    @RequestMapping(path = "/city/capital")
    public List<String> capital() {
        return Arrays.asList("Chennai", "Mumbai", "Delhi", "Kolkatta");
    }


    @RequestMapping("/user")
    public Principal user(Principal user) {
       logger.info("AS /user has been called");
       logger.debug("user info: " + user.toString());
       return user;
    }
}
