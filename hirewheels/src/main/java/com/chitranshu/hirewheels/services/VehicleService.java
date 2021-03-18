package com.chitranshu.hirewheels.services;

import java.util.List;

import com.chitranshu.hirewheels.entities.Vehicle;

public interface VehicleService {
	
	List<Vehicle> getAllVehicle();
	List<Vehicle> getAvailableVehicle();
}
