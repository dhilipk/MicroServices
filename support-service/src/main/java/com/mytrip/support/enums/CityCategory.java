package com.mytrip.support.enums;

import lombok.Getter;

public enum CityCategory {

	TOP_CITIES("Top Cities"),
	TIER1("Tier 1"),
	TIER2("Tier 2"),
	ALL("All");
	private CityCategory(String category) {
		this.category = category;
	}
	@Getter
	private String category;
}
