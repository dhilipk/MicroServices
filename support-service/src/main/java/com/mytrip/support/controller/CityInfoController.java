package com.mytrip.support.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytrip.support.entity.City;
import com.mytrip.support.enums.CityCategory;
import com.mytrip.support.repository.CityRepository;

@RestController
public class CityInfoController {

	private CityRepository cityRepository;

	public CityInfoController(CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}

	@RequestMapping(path = "/v1/cities/top")
	public List<City> getTopCities() {
		return cityRepository.findByCategory(CityCategory.TOP_CITIES);
	}

	@RequestMapping(path = "/v1/cities")
	public List<City> getAllCities() {
		return (List<City>) cityRepository.findAll();
	}

	@RequestMapping(path = "/v1/cities/origin/{originCity}")
	public List<City> getDestinationCitiesByOrigin() {
		return (List<City>) cityRepository.findAll();
	}
}
