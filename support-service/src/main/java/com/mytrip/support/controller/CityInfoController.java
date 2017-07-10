package com.mytrip.support.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytrip.support.entity.City;
import com.mytrip.support.enums.CityCategory;
import com.mytrip.support.repository.CityRepository;

@RestController
public class CityInfoController {

    @Autowired
    private CityRepository cityRepository;

    public CityInfoController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @RequestMapping(path = "/v1/cities/top")
    public Map<String, List<City>> getTopCities() {
        Map<String, List<City>> topCities = new HashMap<>();
        topCities.put("cities", cityRepository.findByCategory(CityCategory.TOP_CITIES));
        return topCities;
    }

    @RequestMapping(path = "/v1/cities")
    public Map<String, List<City>> getAllCities() {
        Map<String, List<City>> topCities = new HashMap<>();
        topCities.put("cities", (List<City>)cityRepository.findAll());
        return topCities;
    }

    @RequestMapping(path = "/v1/cities/origin/{originCity}")
    public List<City> getDestinationCitiesByOrigin() {
        return (List<City>) cityRepository.findAll();
    }

}
