package com.mytrip.flight.search.criteria;

import java.util.Date;

import lombok.Data;

@Data
public class SearchCriteria {

    private String originCity;
    private String destinationCity;
    private String travelDate;
    private Date returnDate;
}
