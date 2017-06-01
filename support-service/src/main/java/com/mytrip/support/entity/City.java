package com.mytrip.support.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.mytrip.support.enums.CityCategory;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class City extends AbstractPersistable<Long>{
	
	/**
	 * Serial Version ID
	 */
	private static final long serialVersionUID = -5185036031455468151L;

	@GeneratedValue
	@Id
	private Long id;
	
	private String name;
	private String airportName;
	private String code;
	private String country;
	private CityCategory category;
	
	protected City() {}

	public City(String name, String airportName, String code, String country, CityCategory category) {
		this.name = name;
		this.airportName = airportName;
		this.code = code;
		this.country = country;
		this.category = category;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", airportName=" + airportName + ", code=" + code + ", country="
				+ country + ", category=" + category + "]";
	}
}
