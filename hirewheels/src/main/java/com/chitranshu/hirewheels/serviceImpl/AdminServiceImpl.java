package com.chitranshu.hirewheels.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.chitranshu.hirewheels.dao.VehicleDAO;
import com.chitranshu.hirewheels.entities.Vehicle;
import com.chitranshu.hirewheels.services.AdminService;

public class AdminServiceImpl implements AdminService{

	@Autowired
	VehicleDAO vehicleDAO;
	
	@Override
	public Vehicle registerVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicle.setAvailabilityStatus(1);
		
		Vehicle vehicleSaved = vehicleDAO.save(vehicle);
		return vehicleSaved;
	}

	@Override
	public Vehicle changeAvailability(int status) {
		// TODO Auto-generated method stub
		return null;
	}

}
