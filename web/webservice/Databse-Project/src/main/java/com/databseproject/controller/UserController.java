package com.databseproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.databseproject.entity.User;
import com.databseproject.model.UserRequest;
import com.databseproject.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	// adding user
	@PostMapping("/addAllUser")
	public String addAllUser(@RequestBody UserRequest userRequest) {
		return userService.addUser(userRequest);

	}// updating user

	@PutMapping("/updateUser")
	public User updateUser(@RequestBody UserRequest userRequest) {
		return userService.upadateUser(userRequest);
	}// delete user by id

	@DeleteMapping("/deleteUser/{id}")
	public String deleteUerById(@PathVariable int id) {
		return userService.deleteUser(id);
	}

	// get list of the user
	@GetMapping("/getList")
	public List<User> getList(@RequestBody UserRequest userRequest) {
		return userService.getAllUser();
	}

	// get user by id
	@GetMapping("/getUserById/{id}")
	public String getUserById(@PathVariable int id) {
		return userService.getUserByid(id);

	}
}
