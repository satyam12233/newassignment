package com.databseproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cust_id")
	private int cust_id;
	
	@Column(name = "first_name", columnDefinition = "varchar(50)")
	@NonNull
	private String first_name;
	
	@Column(name = "last_name",  columnDefinition = "varchar(50)")
	@NonNull
	private String last_name;
	
	@Column(name = "customer_phone", columnDefinition = "varchar(13)")
	@NonNull
	private String customer_phone;

	@OneToOne(mappedBy = "customer")
	SalesOrder salesOrder;
	
	@OneToOne
	@JoinColumn(name = "cart_id", referencedColumnName = "cart_id")
	Cart cart;

	@OneToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	User user;
	
	@OneToOne
	@JoinColumn(name = "billing_address_id", referencedColumnName = "billing_address_id")
	BillingAddress billingAddress;
	
	@OneToOne
	@JoinColumn(name = "shipping_address_id", referencedColumnName = "shipping_address_id")
	ShippingAddress shippingAddress;
	
	public Customer(String first_name, String last_name, String customer_phone) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.customer_phone = customer_phone;
	}

	public Customer(int cust_id, String first_name, String last_name, String customer_phone) {
		super();
		this.cust_id = cust_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.customer_phone = customer_phone;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCustomer_phone() {
		return customer_phone;
	}

	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}

	public SalesOrder getSalesOrder() {
		return salesOrder;
	}

	public void setSalesOrder(SalesOrder salesOrder) {
		this.salesOrder = salesOrder;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
}
