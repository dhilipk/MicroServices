package com.mytrip.common.fare.vo;

import lombok.Data;

@Data
public class FareVo {
    private String flightNumber;
    private String flightDate;
    private String fareAmount;

    public FareVo() {}

    public FareVo(String flightNumber, String flightDate, String fareAmount) {
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
        this.fareAmount = fareAmount;
    }
}
