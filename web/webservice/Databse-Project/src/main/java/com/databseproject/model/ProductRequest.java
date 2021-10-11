package com.databseproject.model;

public class ProductRequest {
	
	private int product_Id;
	private String category;
	private String description;
	private String name;
	private double price;
	private int unit;
	
	public ProductRequest(int product_Id, String category, String description, String name, double price, int unit) {
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
