package com.chitranshu.hirewheels.services;

import com.chitranshu.hirewheels.entities.Vehicle;

public interface AdminService {
	Vehicle registerVehicle(Vehicle vehicle);
	
	Vehicle changeAvailability(int status);
}
