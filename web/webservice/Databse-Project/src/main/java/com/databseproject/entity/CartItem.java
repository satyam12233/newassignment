package com.databseproject.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "cart_item")
public class CartItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cart_item_id")
	private int cart_item_id;

	@Column(name = "quantity")
	@NonNull
	private int quantity;

	@Column(name = "price")
	@NonNull
	private double price;

	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "cart_id", referencedColumnName = "cart_id")
	private Cart cart;

	@OneToOne
	@JoinColumn(name = "product_id", referencedColumnName = "product_id")
	private Product product;

	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
