package com.mytrip.support.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class DestinationCityMapping extends AbstractPersistable<Long> {

	/**
	 * Serial Version ID
	 */
	private static final long serialVersionUID = -5248772026774009405L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private City originCity;
	@ManyToOne
	private City destinationCity;

	public DestinationCityMapping() {}

	public DestinationCityMapping(City originCity, City destinationCity) {
		super();
		this.originCity = originCity;
		this.destinationCity = destinationCity;
	}

	@Override
	public String toString() {
		return "DestinationCityMapping [originCity=" + originCity + ", destinationCity=" + destinationCity + "]";
	}
}
