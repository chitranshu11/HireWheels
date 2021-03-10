package com.chitranshu.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FuelType {
	
	@Id
	private long fuelTypeId;
	
	@Column(length = 50, nullable = false, unique = true)
	private String fuelType;

	public long getFuelTypeId() {
		return fuelTypeId;
	}

	public void setFuelTypeId(long fuelTypeId) {
		this.fuelTypeId = fuelTypeId;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
}
