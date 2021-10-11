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

import com.databseproject.entity.Customer;
import com.databseproject.model.CustomerRequest;
import com.databseproject.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	// adding customer
	@PostMapping("/addCustomer")
	public String addCustomer(@RequestBody CustomerRequest customerRequest) {
		return customerService.addCustomer(customerRequest);

	}

	// updating customer
	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody CustomerRequest customerRequest) {
		return customerService.upadateCustomer(customerRequest);
	}

	// delete customer by id
	@DeleteMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable int id) {
		return customerService.deleteCustomer(id);

	}

	// get All customer
	@GetMapping("/getAllCustomer")
	public List<Customer> getAll() {
		return customerService.getAllCustomer();

	}

	// get customer by id
	@GetMapping("/getCustomeByid/{id}")
	public String findCustomerbyId(@PathVariable int id) {
		return customerService.getCustomerByid(id);

	}

}
