package com.databseproject.service;

import java.util.List;

import com.databseproject.entity.Customer;
import com.databseproject.model.CustomerRequest;

public interface CustomerService {
	
	// add customer
	String addCustomer(CustomerRequest customerRequest);
	
	// update  customer
	Customer upadateCustomer(CustomerRequest customerRequest);
	
	// delete customer by id
	String deleteCustomer(int customerId);
	
	// get all customer list
	List<Customer> getAllCustomer();
	
	// get customer by id
	String getCustomerByid(int customerId);

}
