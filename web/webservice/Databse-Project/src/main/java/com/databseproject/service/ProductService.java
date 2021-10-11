package com.databseproject.service;

import java.util.List;

import com.databseproject.entity.Product;
import com.databseproject.model.ProductRequest;

public interface ProductService {

	// add product
	String addProduct(ProductRequest productRequest);

	// updating the product
	Product updateProduct(ProductRequest productRequest);

	// delete product
	String deleteProduct(int productId);

	// product list
	List<Product> getAllProduct();

	// get product by id
	Product getProductById(int productId);
}
