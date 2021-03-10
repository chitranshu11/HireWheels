package com.chitranshu.hirewheels.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class Booking {
	
	@Id
	private long bookingId;
	
	@Column(nullable = false)
	private Timestamp pickupDate;
	
	@Column(nullable = false)
	private Timestamp dropoffDate;

	@Column(nullable = false)
	private Timestamp bookingDate;
	
	@Column(nullable = false, columnDefinition = "Numeric(10,2)")
	private double amount;
	
	@Column(nullable = false)
	private long locationId;
	
	@Column(nullable = false)
	private long vehicleId;
	
	@Column(nullable = false)
	private long userId;

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public Timestamp getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(Timestamp pickupDate) {
		this.pickupDate = pickupDate;
	}

	public Timestamp getDropoffDate() {
		return dropoffDate;
	}

	public void setDropoffDate(Timestamp dropoffDate) {
		this.dropoffDate = dropoffDate;
	}

	public Timestamp getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Timestamp bookingDate) {
		this.bookingDate = bookingDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
}
