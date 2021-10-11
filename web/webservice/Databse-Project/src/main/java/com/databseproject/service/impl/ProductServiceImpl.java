package com.databseproject.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.databseproject.entity.Product;
import com.databseproject.model.ProductRequest;
import com.databseproject.repository.ProductRepo;
import com.databseproject.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Override
	public String addProduct(ProductRequest productRequest) {
		// TODO Auto-generated method stub

		Product product = new Product(productRequest.getCategory(), productRequest.getDescription(),
				productRequest.getName(), productRequest.getPrice(), productRequest.getUnit());

		product = productRepo.save(product);
		LOGGER.info("Product saved successfully");

		return "Product saved successfully";
	}

	// method to update product
	@Override
	public Product updateProduct(ProductRequest productRequest) {
		Optional<Product> productOptional = productRepo.findById(productRequest.getProduct_Id());
		if (productOptional.isPresent()) {

			Product product = productOptional.get();
			product.setCategory(productRequest.getCategory());
			product.setDescription(productRequest.getDescription());
			product.setName(productRequest.getName());
			product.setPrice(productRequest.getPrice());
			product.setUnit(productRequest.getUnit());
			product = productRepo.save(product);
			LOGGER.info("Product updated successfully");
			return product;
		} else {
			LOGGER.info("Product not found");
			return new Product();
		}
	}

	// method to delete by product
	@Override
	public String deleteProduct(int productId) {
		Optional<Product> productOptional = productRepo.findById(productId);
		if (productOptional.isPresent()) {
			productRepo.deleteById(productOptional.get().getProduct_Id());

			LOGGER.info("Product deleted successfully");
			return "Product deleted successfully";
		} else {
			LOGGER.info("Product not found");
			return "Product not found";
		}
	}

	// method to get product list
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	// method to get product by id
	@Override
	public Product getProductById(int productId) {
		Optional<Product> productOptional = productRepo.findById(productId);
		if (productOptional.isPresent()) {
			LOGGER.info("Record Found");
			return productOptional.get();
		} else {
			LOGGER.info("Record Not Found");
			return new Product();
		}
	}

}
