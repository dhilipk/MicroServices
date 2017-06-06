package com.mytrip.flight.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytrip.flight.search.criteria.SearchCriteria;
import com.mytrip.flight.search.entity.Flight;
import com.mytrip.flight.search.service.OneWaySearchService;

@RestController
public class OneWaySearchController {

	@Autowired
	private OneWaySearchService oneWaySearchService;

	@RequestMapping(path = "/v1/search/flights")
	public List<Flight> search(@RequestBody SearchCriteria criteria) {
		return oneWaySearchService.search(criteria);
	}
}
