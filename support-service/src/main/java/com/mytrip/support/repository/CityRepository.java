package com.mytrip.support.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mytrip.support.entity.City;
import com.mytrip.support.enums.CityCategory;

public interface CityRepository extends CrudRepository<City, Long> {

	List<City> findByCategory(CityCategory category);
}
