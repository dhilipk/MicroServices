package com.mytrip.flight.search.controller;

import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
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
@RibbonClient(name ="flight-fare-service")
public class OneWaySearchController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OneWaySearchController.class);

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
      return new RestTemplate();
    }

    @Autowired
    private OneWaySearchService oneWaySearchService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(path = "/search/flights", method = RequestMethod.POST, 
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<FlightVo> search(@RequestBody SearchCriteria criteria) {
        LOGGER.debug(criteria.toString());
        List<FlightVo> flightVos = new LinkedList<>();
        //TODO Move this as a client configuration
        String restFareUri = "http://flight-fare-service/v1/fares";;

        List<Flight> flights = oneWaySearchService.search(criteria);

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
