package com.chitranshu.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
	
	@Id
	private long vehicleId;
	
	@Column(length = 50, nullable = false)
	private String vehicleModel;
	
	@Column(length = 10, nullable = false)
	private String vehicleNumber;
	
	private String vehicleSubcategoryId;
	
	@Column(length = 50, nullable = false)
	private String color;
	
	@Column(nullable = false)
	private long locationId;
	
	@Column(nullable = false)
	private long fuelTypeId;
	
	@Column(nullable = false)
	private int availabilityStatus;
	
	@Column(length = 500, nullable = false)
	private String vehicleImageUrl;

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleSubcategoryId() {
		return vehicleSubcategoryId;
	}

	public void setVehicleSubcategoryId(String vehicleSubcategoryId) {
		this.vehicleSubcategoryId = vehicleSubcategoryId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public long getFuelTypeId() {
		return fuelTypeId;
	}

	public void setFuelTypeId(long fuelTypeId) {
		this.fuelTypeId = fuelTypeId;
	}

	public int getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(int availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	public String getVehicleImageUrl() {
		return vehicleImageUrl;
	}

	public void setVehicleImageUrl(String vehicleImageUrl) {
		this.vehicleImageUrl = vehicleImageUrl;
	}
	
	
}
