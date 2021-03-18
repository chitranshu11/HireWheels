package com.chitranshu.hirewheels.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chitranshu.hirewheels.dao.UserDAO;
import com.chitranshu.hirewheels.entities.User;
import com.chitranshu.hirewheels.exceptions.LoginException;
import com.chitranshu.hirewheels.exceptions.UserAlreadyExistsException;
import com.chitranshu.hirewheels.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDAO userDAO;
	
	@Override
	public User createUser(User user) throws UserAlreadyExistsException {
		if(userDAO.findByEmail(user.getEmail()) != null)
			throw new UserAlreadyExistsException("Email Already Exists");
		
		if(userDAO.findByMobileNo(user.getMobileNo()) != null)
			throw new UserAlreadyExistsException("Mobile Number Already Exists");
		
		return userDAO.save(user);
		
	}

	@Override
	public User getUser(String email, String password) throws LoginException {
		User user = userDAO.findByEmail(email);
		if(user == null) 
			throw new LoginException("User not Registered");
		if(!user.getPassword().equals(password))
			throw new LoginException("Unauthorized User");
		
		return user;
	}

}
