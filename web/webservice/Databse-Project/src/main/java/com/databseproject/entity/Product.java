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
@Table(name = "product")
public class Product {
	
	public Product() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private int product_Id;
	
	@Column(name = "category" , columnDefinition = "varchar(50)")
	@NonNull
	private String category;
	
	@Column(name = "description" , columnDefinition = "varchar(50)")
	@NonNull
	private String description;
	
	@Column(name = "name" , columnDefinition = "varchar(50)")
	@NonNull
	private String name;
	
	@Column(name = "price")
	@NonNull
	private double price;
	
	@Column(name = "unit")
	@NonNull
	private int unit;
	
	@OneToOne(mappedBy = "product")
	CartItem cartItem;
	
	public Product(String category, String description, String name, double price, int unit) {
		super();
		this.category = category;
		this.description = description;
		this.name = name;
		this.price = price;
		this.unit = unit;
	}
	
	
	public Product(int product_Id, String category, String description, String name, double price, int unit) {
		super();
		this.product_Id = product_Id;
		this.category = category;
		this.description = description;
		this.name = name;
		this.price = price;
		this.unit = unit;
	}


	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}

}
