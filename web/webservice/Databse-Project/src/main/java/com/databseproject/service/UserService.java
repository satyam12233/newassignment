package com.databseproject.service;

import java.util.List;
import com.databseproject.entity.User;
import com.databseproject.model.UserRequest;

public interface UserService {
	
	// add user
	String addUser(UserRequest userRequest);
	
	// // update  user
	User upadateUser(UserRequest userRequest);
	
	// delete user by id
	String deleteUser(int userId);
	
	// get all user list
	List<User> getAllUser();
	
	// get user by id
	String getUserByid(int userId);


}
