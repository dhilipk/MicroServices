package com.mytrip.support.entity;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class City extends AbstractPersistable<Long>{

	/**
	 * Serial Version ID
	 */
	private static final long serialVersionUID = -5185036031455468151L;

}
