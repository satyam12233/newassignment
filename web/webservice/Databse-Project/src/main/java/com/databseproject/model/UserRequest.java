package com.databseproject.model;

import javax.persistence.OneToOne;

import com.databseproject.entity.Customer;

public class UserRequest {

	private int user_id;
	private String email_id;
	private String password;
	@OneToOne
	private Customer customer;

	public UserRequest(int user_id, String email_id, String password, Customer customer) {
		super();
		this.user_id = user_id;
		this.email_id = email_id;
		this.password = password;
		this.customer = customer;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public UserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
