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
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long vehicleId;
	
	@Column(length = 50, nullable = false)
	private String vehicleModel;
	
	@Column(length = 10, nullable = false)
	private String vehicleNumber;
		
	@Column(length = 50, nullable = false)
	private String color;
	
	@Column(nullable = false)
	private int availabilityStatus;
	
	@Column(length = 500, nullable = false)
	private String vehicleImageUrl;
	
	 @OneToMany(mappedBy = "vehicle",fetch = FetchType.EAGER)
	 private Set<Booking> bookings;
	 
	@ManyToOne
	@JoinColumn(name = "location_id", nullable = false)
	private Location location;
	
	@ManyToOne
	@JoinColumn(name = "vehicle_subcategory_id", nullable = false)
	private VehicleSubCategory vehicleSubcategory;
	
	@ManyToOne
	@JoinColumn(name = "fuel_type_id", nullable = false)
	private FuelType fuelType;

	public Set<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

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


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public VehicleSubCategory getVehicleSubcategory() {
		return vehicleSubcategory;
	}

	public void setVehicleSubcategory(VehicleSubCategory vehicleSubcategory) {
		this.vehicleSubcategory = vehicleSubcategory;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	
	
}
