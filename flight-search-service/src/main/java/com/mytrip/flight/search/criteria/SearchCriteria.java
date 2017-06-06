package com.mytrip.flight.search.criteria;

import lombok.Data;

@Data
public class SearchCriteria {

	private String originCity;
	private String destinationCity;
	private String travelDate;
}
