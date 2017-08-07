package com.mytrip.common.flight.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @Builder @NoArgsConstructor  @AllArgsConstructor
public class FlightScheduleVo {

    private String customerId;
    private String confirmationNumber;
    private String pnr;
    private String flightNumber;
    private String dateOfTravel;

}
