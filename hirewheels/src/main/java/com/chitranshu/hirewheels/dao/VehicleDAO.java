package com.chitranshu.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chitranshu.hirewheels.entities.Vehicle;

public interface VehicleDAO extends JpaRepository<Vehicle, Long>{

}
