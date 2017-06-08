package com.mytrip.flight.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytrip.common.vo.FlightVo;
import com.mytrip.flight.search.criteria.SearchCriteria;
import com.mytrip.flight.search.entity.Flight;
import com.mytrip.flight.search.service.OneWaySearchService;

@RestController
@RequestMapping(path = "/v1")
public class OneWaySearchController {

    @Autowired
    private OneWaySearchService oneWaySearchService;

    @RequestMapping(path = "/search/flights")
    public List<FlightVo> search(@RequestBody SearchCriteria criteria) {
        List<Flight> flights = oneWaySearchService.search(criteria);
        //TODO Retrieve the Fare amount for that flight from flight-fare-service and return the FlightVo Object with all the specific details
        return null;
    }
}
