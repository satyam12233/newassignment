package com.databseproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.databseproject.entity.Product;
import com.databseproject.model.ProductRequest;
import com.databseproject.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	// adding product
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody ProductRequest productRequest) {
		return productService.addProduct(productRequest);

	}

	// get product list
	@GetMapping("/getAllProduct")
	public List<Product> getAll() {
		return productService.getAllProduct();
	}

	// update product
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody ProductRequest productRequest) {
		return productService.updateProduct(productRequest);
	}

	// delete product
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProductbyId(@PathVariable int id) {
		return productService.deleteProduct(id);
	}

	// get product by id
	@GetMapping("/getProductById/{id}")
	public Product getProduct(@PathVariable int id) {
		return productService.getProductById(id);
	}
}
