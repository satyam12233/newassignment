package com.databseproject.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.databseproject.entity.BillingAddress;
import com.databseproject.entity.Cart;
import com.databseproject.entity.Customer;
import com.databseproject.entity.ShippingAddress;
import com.databseproject.entity.User;
import com.databseproject.model.CustomerRequest;
import com.databseproject.repository.BillingAddressRepo;
import com.databseproject.repository.CartRepo;
import com.databseproject.repository.CustomerRepo;
import com.databseproject.repository.ShippingAddressRepo;
import com.databseproject.repository.UserRepo;
import com.databseproject.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo customerRepo;

	@Autowired
	ShippingAddressRepo shippingAddressRepo;

	@Autowired
	BillingAddressRepo billingAddressRepo;

	@Autowired
	UserRepo userRepo;

	@Autowired
	CartRepo cartRepo;

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Override
	// add customer
	public String addCustomer(CustomerRequest customerRequest) {

		ShippingAddress shippingAddress = shippingAddressRepo.save(customerRequest.getShippingAddress());
		BillingAddress billingAddress = billingAddressRepo.save(customerRequest.getBillingAddress());
		User user = userRepo.findById(customerRequest.getUserId()).get();

		Customer customer = new Customer(customerRequest.getFirst_name(), customerRequest.getLast_name(),
				customerRequest.getCustomer_phone());
		customer.setBillingAddress(billingAddress);
		customer.setShippingAddress(shippingAddress);
		customer.setUser(user);
		if (customerRequest.getCartId() > 0) {
			Cart cart = cartRepo.findById(customerRequest.getCartId()).get();
			customer.setCart(cart);
		} else {
			Cart cart = new Cart();
			cart.setTotal_price(0);
			cart = cartRepo.save(cart);
			customer.setCart(cart);
		}
		customer = customerRepo.save(customer);

		// TODO Auto-generated method stub
		LOGGER.info("Customer Record added successfully");
		return "Customer saved successfully";
	}

	// update customer
	@Override
	public Customer upadateCustomer(CustomerRequest customerRequest) {
		Optional<Customer> customerOptional = customerRepo.findById(customerRequest.getCust_id());
		if (customerOptional.isPresent()) {
			Customer customer = customerOptional.get();
			customer.setFirst_name(customerRequest.getFirst_name());
			customer.setLast_name(customerRequest.getLast_name());
			customer.setCustomer_phone(customerRequest.getCustomer_phone());
			LOGGER.info("Customer updated successfully");
			return customer;
		} else {
			LOGGER.info("Customer not found");
			return new Customer();
		}

	}

	// delete customer
	@Override
	public String deleteCustomer(int customerId) {
		Optional<Customer> optionalCustomer = customerRepo.findById(customerId);
		// TODO Auto-generated method stub
		if (optionalCustomer.isPresent()) {
			customerRepo.deleteById(optionalCustomer.get().getCust_id());
			LOGGER.info("Customer deleted successfully");
			return "Customer deleted successfully";
		} else {
			LOGGER.info("Customer not found");
			return "Customer info not Deleted";
		}

	}

	// get all customer list
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	// get customer by id
	@Override
	public String getCustomerByid(int customerId) {
		Optional<Customer> optionalCustomer = customerRepo.findById(customerId);
		// TODO Auto-generated method stub
		if (optionalCustomer.isPresent()) {
			customerRepo.findById(optionalCustomer.get().getCust_id());
			LOGGER.info("Record Found Successfully");
			return "Record Found Successfully";
		} else {
			LOGGER.info("Record not Found");
			return "Customer not found";
		}

	}

}
