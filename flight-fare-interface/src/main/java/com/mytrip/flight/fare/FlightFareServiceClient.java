package com.mytrip.flight.fare;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "flight-fare-service")
public interface FlightFareServiceClient extends FlightFareService {

}
