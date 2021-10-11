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

import com.databseproject.entity.CartItem;
import com.databseproject.model.CartItemRequest;
import com.databseproject.service.CartItemService;

@RestController
@RequestMapping("/cartItem")
public class CartItemController {
	@Autowired
	CartItemService cartItemService;

	// adding cart items
	@PostMapping("/addAllCartItems")
	public String addAllCartItems(@RequestBody CartItemRequest cartItemRequest) {
		return cartItemService.addCartItem(cartItemRequest);
	}

	// delete cart items
	@DeleteMapping("/deleteCartItemsById/{id}")
	public String deleteCartItemsById(@PathVariable int id) {
		return cartItemService.deleteCartItems(id);
	}

	// getting list of cartItems
	@GetMapping("/getList")
	public List<CartItem> getList(@RequestBody CartItemRequest cartItemRequest) {
		return cartItemService.getCartItems();
	}

	// get cartItem by id
	@GetMapping("/getCartItemById/{id}")
	public CartItem getCartItemById(@PathVariable int id) {
		return cartItemService.getCartItemByid(id);

	}
}
