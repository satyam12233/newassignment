package com.databseproject.service;

import java.util.List;

import com.databseproject.entity.SalesOrder;
import com.databseproject.model.SalesOrderRequest;

public interface SalesOrderService {

	// add SalesOrder
	String addSalesOrder(SalesOrderRequest salesOrderRequest);

	// delete SalesOrder by id
	String deleteSalesOrder(int salesOrderId);

	// get all SalesOrder list
	List<SalesOrder> getAllSalesOrder();

	// get SalesOrder by id
	String getSalesOrderByid(int salesOrderId);

}
