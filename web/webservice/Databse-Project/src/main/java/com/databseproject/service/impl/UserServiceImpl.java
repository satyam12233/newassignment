package com.databseproject.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.databseproject.entity.User;
import com.databseproject.model.UserRequest;
import com.databseproject.repository.UserRepo;
import com.databseproject.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo userRepo;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Override
	// add user
	public String addUser(UserRequest userRequest) {
		// TODO Auto-generated method stub
		User user = new User(userRequest.getEmail_id(), userRequest.getPassword(), userRequest.getCustomer());
		user = userRepo.save(user);
		LOGGER.info("User Record added successfully");
		return "User saved successfully";
	}

	@Override
	// updating user list
	public User upadateUser(UserRequest userRequest) {
		// TODO Auto-generated method stub
		Optional<User> userOptional = userRepo.findById(userRequest.getUser_id());
		if (userOptional.isPresent()) {
			User user = userOptional.get();
			user.setEmail_id(userRequest.getEmail_id());
			user.setPassword(userRequest.getPassword());
			user.setCustomer(userRequest.getCustomer());
			LOGGER.info("User updated successfully");
			return user;
		} else {
			LOGGER.info("User not found");
			return new User();
		}

	}

	@Override
	// delete user by id
	public String deleteUser(int userId) {
		// TODO Auto-generated method stub
		Optional<User> optionalUser = userRepo.findById(userId);
		if (optionalUser.isPresent()) {
			userRepo.deleteById(optionalUser.get().getUser_id());
			LOGGER.info("User deleted successfully");
			return "User deleted successfully";
		} else {
			LOGGER.info("Usernot found");
			return "User info not Deleted";
		}

	}

	@Override
	// user list
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	// get all user by id
	public String getUserByid(int userId) {
		// TODO Auto-generated method stub
		Optional<User> optionalUser = userRepo.findById(userId);
		if (optionalUser.isPresent()) {
			userRepo.findById(optionalUser.get().getUser_id());
			LOGGER.info("Record Found Successfully");
			return "User  Found ";
		} else {
			LOGGER.info("Record Not Found");
			return "User Not Found";
		}

	}
}