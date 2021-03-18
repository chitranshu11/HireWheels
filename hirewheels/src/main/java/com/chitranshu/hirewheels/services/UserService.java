package com.chitranshu.hirewheels.services;

import com.chitranshu.hirewheels.entities.User;
import com.chitranshu.hirewheels.exceptions.LoginException;
import com.chitranshu.hirewheels.exceptions.UserAlreadyExistsException;

public interface UserService {
	User createUser(User user) throws UserAlreadyExistsException;
	
	User getUser(String email, String password) throws LoginException;
}
