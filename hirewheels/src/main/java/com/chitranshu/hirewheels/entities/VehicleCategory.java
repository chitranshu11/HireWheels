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
public class VehicleCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long vehicleCategoryId;
	
	@Column(nullable = false, length = 50, unique = true)
	private String vehicleCategoryName;
	
	@OneToMany (mappedBy = "vehicleCategory",fetch = FetchType.EAGER)
	private Set<VehicleSubcategory> vehicleSubcategories;

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

	public Set<VehicleSubcategory> getVehicleSubcategories() {
		return vehicleSubcategories;
	}

	public void setVehicleSubcategories(Set<VehicleSubcategory> vehicleSubcategories) {
		this.vehicleSubcategories = vehicleSubcategories;
	}
	
	
}
