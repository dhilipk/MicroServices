package com.mytrip.flight.fare.controller;

import java.util.Calendar;

import org.springframework.web.bind.annotation.RestController;

import com.mytrip.common.fare.vo.FareVo;
import com.mytrip.flight.fare.FlightFareService;

@RestController
public class FlightFareController implements FlightFareService {

    public FareVo getFareForFlightAndDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 06, 20, 19, 30);
        FareVo fareVo = new FareVo("6E 311", "29/12/2017", "200");
        return fareVo;
    }
}
