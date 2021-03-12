package com.chitranshu.hirewheels.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FuelType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long fuelTypeId;
	
	@Column(length = 50, nullable = false, unique = true)
	private String fuelType;
	
	@OneToMany (mappedBy = "fuelType",fetch = FetchType.EAGER)
	private Set<Vehicle> vehicles;

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

	public Set<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
}
