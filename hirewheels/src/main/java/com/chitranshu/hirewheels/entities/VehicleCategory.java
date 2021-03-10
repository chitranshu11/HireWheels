package com.chitranshu.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleCategory {
	@Id
	private long vehicleCategoryId;
	
	@Column(nullable = false, length = 50, unique = true)
	private String vehicleCategoryName;

	public long getVehicleCategoryId() {
		return vehicleCategoryId;
	}

	public void setVehicleCategoryId(long vehicleCategoryId) {
		this.vehicleCategoryId = vehicleCategoryId;
	}

	public String getVehicleCategoryName() {
		return vehicleCategoryName;
	}

	public void setVehicleCategoryName(String vehicleCategoryName) {
		this.vehicleCategoryName = vehicleCategoryName;
	}
	
	
}
