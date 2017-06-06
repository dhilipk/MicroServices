package com.mytrip.flight.search.service;

import java.util.List;

import com.mytrip.flight.search.criteria.SearchCriteria;
import com.mytrip.flight.search.entity.Flight;

public interface OneWaySearchService {

	List<Flight> search(SearchCriteria query);
}
