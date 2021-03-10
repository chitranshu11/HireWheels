package com.chitranshu.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Id;

public class City {
	
	@Id
	private long cityId;
	
	@Column(length = 50, nullable = false)
	private String cityName;

	public long getCityId() {
		return cityId;
	}

	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
}
