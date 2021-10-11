package com.databseproject.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.databseproject.entity.Cart;
import com.databseproject.entity.CartItem;
import com.databseproject.model.CartItemRequest;
import com.databseproject.repository.CartItemRepo;
import com.databseproject.repository.CartRepo;
import com.databseproject.repository.ProductRepo;
import com.databseproject.service.CartItemService;

@Service
public class CartItemImpl implements CartItemService {
	@Autowired
	CartItemRepo cartItemRepo;

	@Autowired
	CartRepo cartRepo;

	@Autowired
	ProductRepo productRepo;

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Override
	// adding cart items
	public String addCartItem(CartItemRequest cartItemRequest) {
		// TODO Auto-generated method stub
		Cart cart = cartRepo.findById(cartItemRequest.getCartId()).get();
		CartItem cartItem = new CartItem();
		cartItem.setCart(cart);
		cartItem.setPrice(cartItemRequest.getPrice());
		cartItem.setQuantity(cartItemRequest.getQuantity());
		cartItem.setProduct(productRepo.getById(cartItemRequest.getProductId()));
		cartItem = cartItemRepo.save(cartItem);
		// updating total amount of cart
		cart.setTotal_price(cart.getTotal_price() + cartItem.getPrice());
		cartRepo.save(cart);
		LOGGER.info("CartItem Added Successfully");
		return "CartItem Added Successfully";

	}

	@Override
	// delete cart item by id
	public String deleteCartItems(int cartItemId) {
		// TODO Auto-generated method stub
		Optional<CartItem> cartItemOptional = cartItemRepo.findById(cartItemId);
		if (cartItemOptional.isPresent()) {
			cartItemRepo.deleteById(cartItemId);
			LOGGER.info("Cart Item Deleted Successfully");
			return "Cart Item Deleted Successfully";
		} else {
			LOGGER.info("Cart Item not deleted");
			return "Cart Item not deleted";
		}

	}

	@Override
	// list of cart item
	public List<CartItem> getCartItems() {
		// TODO Auto-generated method stub
		return cartItemRepo.findAll();
	}

	@Override
	// get cart item by id
	public CartItem getCartItemByid(int cartItemId) {
		// TODO Auto-generated method stub
		Optional<CartItem> cartItemOptional = cartItemRepo.findById(cartItemId);
		// TODO Auto-generated method stub
		if (cartItemOptional.isPresent()) {

			return cartItemOptional.get();
		} else {
			LOGGER.info("Record not Found");
			return new CartItem();
		}

	}

}
