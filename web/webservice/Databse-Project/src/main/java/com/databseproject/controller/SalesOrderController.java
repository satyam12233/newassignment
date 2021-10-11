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

import com.databseproject.entity.SalesOrder;
import com.databseproject.model.SalesOrderRequest;
import com.databseproject.service.SalesOrderService;

@RestController
@RequestMapping("/salesOrder")
public class SalesOrderController {
	@Autowired
	SalesOrderService salesOrderService;

	// adding sales order details
	@PostMapping("/addAllSalesrder")
	public String addAllSalesrder(@RequestBody SalesOrderRequest salesOrderRequest) {
		return salesOrderService.addSalesOrder(salesOrderRequest);
	}

	// delete sales order by id
	@DeleteMapping("/deleteSalesOrderById/{id}")
	public String deleteSalesOrderById(@PathVariable int id) {
		return salesOrderService.deleteSalesOrder(id);

	}

	// get list of the sales order
	@GetMapping("/getList")
	public List<SalesOrder> getSalesOrderList(@RequestBody SalesOrderRequest salesOrderRequest) {
		return salesOrderService.getAllSalesOrder();
	}

	// get sales order by id
	@GetMapping("/getSalesOrderById/{id}")
	public String getSalesOrderById(@PathVariable int id) {
		return salesOrderService.getSalesOrderByid(id);

	}

}
