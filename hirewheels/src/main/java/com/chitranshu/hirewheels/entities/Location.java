package com.chitranshu.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Id;

public class Location {
	
	@Id
	private long locationId;
	
	@Column(length = 50, nullable = false)
	private String locationName;
	
	@Column(length = 100, nullable = false)
	private String address;
	
	@Column(nullable = false)
	private long cityId;
	
	@Column(length = 6, nullable = false)
	private String pincode;

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

	public long getCityId() {
		return cityId;
	}

	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
