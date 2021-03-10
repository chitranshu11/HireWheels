package com.chitranshu.hirewheels.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chitranshu.hirewheels.entities.Users;

public interface UserDAO extends JpaRepository<Users, Long>{
	
	List<Users> findByFirstName(String firstName);
	
	List<Users> findByLastName(String lastName);
	
	List<Users> findByFirstNameOrLastName(String firstName, String lastName);
	
	List<Users> findByEmail(String email);

	List<Users> findByMobileNo(String mobileNo);

}
