package com.chitranshu.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chitranshu.hirewheels.entities.UserRole;

public interface UserRoleDAO extends JpaRepository<UserRole, Long> {

}
