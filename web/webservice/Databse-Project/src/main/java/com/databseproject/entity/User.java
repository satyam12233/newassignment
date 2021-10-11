package com.databseproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int user_id;

	@Column(name = "email_id", columnDefinition = "varchar(50)")
	@NonNull
	private String email_id;

	@Column(name = "password" , columnDefinition = "varchar(50)")
	@NonNull
	private String password;

	@OneToOne(mappedBy = "user")
	private Customer customer;

	public User(int user_id, String email_id, String password, Customer customer) {
		super();
		this.user_id = user_id;
		this.email_id = email_id;
		this.password = password;
		this.customer = customer;
	}

	public User(String email_id, String password, Customer customer) {
		super();
		this.email_id = email_id;
		this.password = password;
		this.customer = customer;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
