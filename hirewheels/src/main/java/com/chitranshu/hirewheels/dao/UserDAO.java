package com.chitranshu.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chitranshu.hirewheels.entities.Users;

public interface UserDAO extends JpaRepository<Users, Long>{

}
