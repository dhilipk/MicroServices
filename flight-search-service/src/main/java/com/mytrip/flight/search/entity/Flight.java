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
	private Long id;
	
	private String flightNumber;
	private String originCityCode;
	private String destinationCityCode;
	private String flightDate;

	public Flight() {}

	public Flight(String flightNumber, String originCityCode, String destinationCityCode, String flightDate) {
		super();
		this.flightNumber = flightNumber;
		this.originCityCode = originCityCode;
		this.destinationCityCode = destinationCityCode;
		this.flightDate = flightDate;
	}	
}
