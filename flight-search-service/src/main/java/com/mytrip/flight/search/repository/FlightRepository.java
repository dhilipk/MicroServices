package com.mytrip.flight.search.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mytrip.flight.search.entity.Flight;

public interface FlightRepository extends CrudRepository<Flight, Long> {

    List<Flight> findByOriginCityCodeAndDestinationCityCodeAndFlightDate(String originCityCode, String destinationCityCode, String flightDate);
}
