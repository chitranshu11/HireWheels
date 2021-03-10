package com.chitranshu.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleSubcategory {
	@Id
	private long vehicleSubcategoryId;
	
	@Column(nullable = false, length = 50, unique = true)
	private String vehicleSubcategoryName;
	
	@Column(nullable = false, columnDefinition = "Numeric(10,2)")
	private double pricePerDay;
	
	@Column(nullable = false)
	private long vehicleCategoryId;

	public long getVehicleSubcategoryId() {
		return vehicleSubcategoryId;
	}

	public void setVehicleSubcategoryId(long vehicleSubcategoryId) {
		this.vehicleSubcategoryId = vehicleSubcategoryId;
	}

	public String getVehicleSubcategoryName() {
		return vehicleSubcategoryName;
	}

	public void setVehicleSubcategoryName(String vehicleSubcategoryName) {
		this.vehicleSubcategoryName = vehicleSubcategoryName;
	}

	public double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public long getVehicleCategoryId() {
		return vehicleCategoryId;
	}

	public void setVehicleCategoryId(long vehicleCategoryId) {
		this.vehicleCategoryId = vehicleCategoryId;
	}
	
	
}
