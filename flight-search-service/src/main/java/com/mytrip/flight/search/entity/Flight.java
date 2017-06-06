package com.mytrip.flight.search.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Flight {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String flightNumber;
	private String originCity;
	private String destinationCity;
	private String flightDate;
}
