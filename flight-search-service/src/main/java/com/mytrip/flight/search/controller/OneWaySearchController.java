package com.mytrip.flight.search.controller;

import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mytrip.common.vo.FareVo;
import com.mytrip.common.vo.FlightVo;
import com.mytrip.flight.search.criteria.SearchCriteria;
import com.mytrip.flight.search.entity.Flight;
import com.mytrip.flight.search.service.OneWaySearchService;

@RestController
@RequestMapping(path = "/v1")
public class OneWaySearchController {

    /**
     * FARE Service application name which needs to be moved to Client Configuration
     * TODO Move this name and calling URL to the client configuration
     */
    private static final String FARE_SERVICE = "flight-fare-service";

    private static final Logger LOGGER = LoggerFactory.getLogger(OneWaySearchController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private OneWaySearchService oneWaySearchService;

    @RequestMapping(path = "/search/flights", method = RequestMethod.GET, 
            consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    public List<FlightVo> search(@RequestBody SearchCriteria criteria) {
        LOGGER.debug(criteria.toString());
        List<FlightVo> flightVos = new LinkedList<>();
        String restFareUri = null;

        List<Flight> flights = oneWaySearchService.search(criteria);
        //TODO Move this to the flight-fare-client for any interaction with flight-fare-service
        List<ServiceInstance> instances = discoveryClient.getInstances(FARE_SERVICE);
        for (ServiceInstance serviceInstance : instances) {
            LOGGER.debug("Service Instance : " + serviceInstance.getServiceId() + serviceInstance.getUri());
            if(serviceInstance.getServiceId().equalsIgnoreCase(FARE_SERVICE)) {
                restFareUri = serviceInstance.getUri().toString() + "/v1/fares";
                break;
            }
        }

        RestTemplate restTemplate = new RestTemplate();
        //TODO Check for getForEntity
        FareVo fareVo = restTemplate.getForObject(restFareUri, FareVo.class);
        FlightVo.FlightVoBuilder builder = FlightVo.builder();
        for (Flight flight : flights) {
            flightVos.add(builder.flightDate(flight.getFlightDate())
                    .destinationCity(flight.getDestinationCityCode())
                    .flightNumber(flight.getFlightNumber())
                    .originCity(flight.getOriginCityCode())
                    .fareAmount(fareVo.getFareAmount()).build());
        }
        return flightVos;
    }
}
