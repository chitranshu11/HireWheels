package com.chitranshu.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chitranshu.hirewheels.entities.Booking;

public interface BookingDAO extends JpaRepository<Booking, Long>{

}
