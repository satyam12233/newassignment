package com.databseproject.service;

import java.util.List;

import com.databseproject.entity.CartItem;
import com.databseproject.model.CartItemRequest;

public interface CartItemService {

	// add CartItem
	String addCartItem(CartItemRequest cartItemRequest);

	// delete CartItem by id
	String deleteCartItems(int cartItemId);

	// get all CartItem list
	List<CartItem> getCartItems();

	// get CartItem by id
	CartItem getCartItemByid(int cartItemId);

}
