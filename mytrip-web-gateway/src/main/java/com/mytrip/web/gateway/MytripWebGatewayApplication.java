package com.mytrip.web.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class MytripWebGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MytripWebGatewayApplication.class, args);
	}
}
