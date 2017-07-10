package com.mytrip.common.flight.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @Builder
public class FlightVo {

    private String flightNumber;
    private String originCity;
    private String destinationCity;
    private String flightDate;
    private String fareAmount;
}
