package com.mytrip.travel.schedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mytrip.common.flight.vo.FlightScheduleVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TravelScheduleController {

    RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(path = "v1/book/flight/domestic")
    public String bookFlightDomestic() {
        //Presist booking information
        FlightScheduleVo flightScheduleVo = FlightScheduleVo
                                                .builder()
                                                .confirmationNumber("123")
                                                .customerId("123")
                                                .dateOfTravel("27/12/2017")
                                                .flightNumber("6E 516")
                                                .pnr("asbcsdsa73232")
                                                .build();
        String url = "http://localhost:8084/v1/notify/customer";
        log.info(url);
        try {
            restTemplate.postForObject(url, flightScheduleVo, Object.class);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return "Ticket Booked";
    }

}
