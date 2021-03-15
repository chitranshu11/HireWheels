package com.chitranshu.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chitranshu.hirewheels.entities.VehicleCategory;

public interface VehicleCategoryDAO  extends JpaRepository<VehicleCategory, Long>{

	VehicleCategory findByVehicleCategoryId(long l);

}
