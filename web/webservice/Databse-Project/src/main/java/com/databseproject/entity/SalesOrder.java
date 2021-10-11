package com.databseproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sales_order")
public class SalesOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sales_order_id")
	private int sales_order_id;

	@OneToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "cust_id")
	private Customer customer;

	
	@OneToOne
	@JoinColumn(name = "shipping_address_id", referencedColumnName = "shipping_address_id")
	private ShippingAddress shippingAddress;

	@OneToOne
	@JoinColumn(name = "billing_address_id", referencedColumnName = "billing_address_id")
	private BillingAddress billingAddress;

	@OneToOne
	@JoinColumn(name = "cart_id", referencedColumnName = "cart_id")
	private Cart cart;

	public SalesOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSales_order_id() {
		return sales_order_id;
	}

	public void setSales_order_id(int sales_order_id) {
		this.sales_order_id = sales_order_id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
