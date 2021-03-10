package com.chitranshu.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chitranshu.hirewheels.entities.Location;

public interface LocationDAO extends JpaRepository<Location, Long>{

}
