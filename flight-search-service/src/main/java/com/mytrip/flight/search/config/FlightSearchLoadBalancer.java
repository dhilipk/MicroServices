package com.mytrip.flight.search.config;

import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IRule;

public class FlightSearchLoadBalancer {

    @Bean
    public IRule ribbonRule(IClientConfig config) {
      return new AvailabilityFilteringRule();
    }
}
