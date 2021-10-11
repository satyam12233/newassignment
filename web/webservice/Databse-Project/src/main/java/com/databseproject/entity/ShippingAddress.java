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
@Table(name = "shipping_address")
public class ShippingAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "shipping_address_id")
	private int shipping_address_id;
	
	@Column(name = "address" , columnDefinition = "varchar(50)")
	@NonNull
	private String address;
	
	@Column(name = "city" , columnDefinition = "varchar(50)")
	@NonNull
	private String city;
	
	@Column(name = "state" , columnDefinition = "varchar(50)")
	@NonNull
	private String state;
	
	@Column(name = "zipcode" , columnDefinition = "varchar(50)")
	@NonNull
	private String zipcode;
	
	@Column(name = "country" , columnDefinition = "varchar(50)")
	@NonNull
	private String country;
	
	@OneToOne(mappedBy = "shippingAddress")
	private Customer customer;
	
	@OneToOne(mappedBy = "shippingAddress")
	private SalesOrder salesOrder;

	public int getShipping_address_id() {
		return shipping_address_id;
	}

	public void setShipping_address_id(int shipping_address_id) {
		this.shipping_address_id = shipping_address_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
