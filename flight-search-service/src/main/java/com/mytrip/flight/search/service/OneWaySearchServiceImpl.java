package com.mytrip.flight.search.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytrip.flight.search.criteria.SearchCriteria;
import com.mytrip.flight.search.entity.Flight;
import com.mytrip.flight.search.repository.FlightRepository;

@Service(value = "oneWaySearchService")
public class OneWaySearchServiceImpl implements OneWaySearchService {

	private FlightRepository flightRepository;
	private static final Logger logger = LoggerFactory.getLogger(OneWaySearchServiceImpl.class);
	
	@Autowired
	public OneWaySearchServiceImpl(FlightRepository flightRepository){
		this.flightRepository = flightRepository;
	}
	

	public List<Flight> search(SearchCriteria query) {
		logger.debug("search Call : " + query);
		return flightRepository.findByOriginCityAndDestinationCityAndFlightDate(query.getOriginCity(), query.getDestinationCity(), query.getTravelDate());
	}
}
