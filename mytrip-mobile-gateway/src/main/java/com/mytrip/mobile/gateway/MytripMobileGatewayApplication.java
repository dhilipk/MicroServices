package com.mytrip.mobile.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class MytripMobileGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MytripMobileGatewayApplication.class, args);
    }

}
