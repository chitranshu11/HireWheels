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
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long locationId;
	
	@Column(length = 50, nullable = false)
	private String locationName;
	
	@Column(length = 100, nullable = false)
	private String address;
	
	@Column(length = 6, nullable = false)
	private String pincode;
	
	@ManyToOne
	@JoinColumn(name = "city_id", nullable = false)
	private City city;
	
	 @OneToMany (mappedBy = "location",fetch = FetchType.EAGER)
	 private Set<Booking> bookings;
	 
	 @OneToMany (mappedBy = "location",fetch = FetchType.EAGER)
	 private Set<Vehicle> vehicles;


	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Set<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Set<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	
}
