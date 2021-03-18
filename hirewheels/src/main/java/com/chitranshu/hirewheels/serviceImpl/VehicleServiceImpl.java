package com.chitranshu.hirewheels.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chitranshu.hirewheels.dao.VehicleDAO;
import com.chitranshu.hirewheels.entities.Vehicle;
import com.chitranshu.hirewheels.services.VehicleService;

public class VehicleServiceImpl implements VehicleService{

	@Autowired
	VehicleDAO vehicleDAO;
	
	@Override
	public List<Vehicle> getAllVehicle() {
		return vehicleDAO.findAll();
	}

	@Override
	public List<Vehicle> getAvailableVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

}
