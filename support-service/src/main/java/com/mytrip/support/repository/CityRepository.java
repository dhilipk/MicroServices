package com.mytrip.support.repository;

import org.springframework.data.repository.CrudRepository;

import com.mytrip.support.entity.City;

public interface CityRepository extends CrudRepository<City, Long> {

}
