package com.chitranshu.hirewheels.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chitranshu.hirewheels.entities.User;

public interface UserDAO extends JpaRepository<User, Long>{
	
	List<User> findByFirstName(String firstName);
	
	List<User> findByLastName(String lastName);
	
	List<User> findByFirstNameOrLastName(String firstName, String lastName);
	
	List<User> findByEmail(String email);

	List<User> findByMobileNo(String mobileNo);

}
