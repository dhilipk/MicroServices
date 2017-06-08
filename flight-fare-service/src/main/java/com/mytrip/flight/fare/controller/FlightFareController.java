package com.mytrip.flight.fare.controller;

import java.util.Calendar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mytrip.common.vo.FareVo;
import com.mytrip.flight.fare.constant.FlightFareConstants;

@RequestMapping(path = "/v1")
@RestController
public class FlightFareController {

    @RequestMapping(path = FlightFareConstants.URI_DATE_AND_FLIGHT_NUMBER, method = RequestMethod.GET)
    public FareVo getFareForFlightAndDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 06, 20, 19, 30);
        FareVo fareVo = new FareVo("6E 311", "29/12/2017", "200");
        return fareVo;
    }
}
