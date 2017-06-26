package com.mytrip.flight.fare;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mytrip.common.fare.vo.FareVo;
import com.mytrip.flight.fare.constant.FlightFareConstants;

@RequestMapping(path = "/v1")
public interface FlightFareService {

    @RequestMapping(path = FlightFareConstants.URI_DATE_AND_FLIGHT_NUMBER, method = RequestMethod.GET)
    FareVo getFareForFlightAndDate();
}
