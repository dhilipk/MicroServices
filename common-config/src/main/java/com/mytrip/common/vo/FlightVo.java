package com.mytrip.common.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @Builder
public class FlightVo {

	private Long id;
	private String flightNumber;
	private String originCity;
	private String destinationCity;
	private String flightDate;
}
