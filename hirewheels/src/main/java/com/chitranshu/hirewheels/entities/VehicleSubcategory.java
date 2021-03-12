package com.chitranshu.hirewheels.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class VehicleSubcategory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long vehicleSubcategoryId;
	
	@Column(nullable = false, length = 50, unique = true)
	private String vehicleSubcategoryName;
	
	@Column(nullable = false, columnDefinition = "Numeric(10,2)")
	private double pricePerDay;
	
	
	
	@OneToMany (mappedBy = "vehicleSubcategory",fetch = FetchType.EAGER)
	private Set<Vehicle> vehicles;
	
	@ManyToOne
	@JoinColumn(name = "vehicle_category_id", nullable = false)
	private VehicleCategory vehicleCategory;

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

	public Set<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public VehicleCategory getVehicleCategory() {
		return vehicleCategory;
	}

	public void setVehicleCategory(VehicleCategory vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}
	
	
}
