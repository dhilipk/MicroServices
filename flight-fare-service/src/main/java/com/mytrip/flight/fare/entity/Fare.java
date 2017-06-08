package com.mytrip.flight.fare.entity;

import java.util.Date;

import lombok.Data;

/**
 * TODO Fare needs to be converted to Entity
 */
@Data
public class Fare {

    private String flightNumber;
    private Date flightDate;
    private String fareAmount;

    public Fare(String flightNumber, Date flightDate, String fareAmount) {
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
        this.fareAmount = fareAmount;
    }

}
