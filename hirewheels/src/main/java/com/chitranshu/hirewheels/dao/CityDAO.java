package com.chitranshu.hirewheels.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chitranshu.hirewheels.entities.City;

public interface CityDAO extends JpaRepository<City, Long> {

	City findByCityName(String city);

}
