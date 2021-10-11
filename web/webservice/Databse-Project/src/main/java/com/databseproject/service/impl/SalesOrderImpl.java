package com.databseproject.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.databseproject.entity.BillingAddress;
import com.databseproject.entity.Customer;
import com.databseproject.entity.SalesOrder;
import com.databseproject.entity.ShippingAddress;
import com.databseproject.model.SalesOrderRequest;
import com.databseproject.repository.BillingAddressRepo;
import com.databseproject.repository.CartRepo;
import com.databseproject.repository.CustomerRepo;
import com.databseproject.repository.SalesOrderRepo;
import com.databseproject.repository.ShippingAddressRepo;
import com.databseproject.service.SalesOrderService;

@Service
public class SalesOrderImpl implements SalesOrderService {

	@Autowired
	SalesOrderRepo salesOrderRepo;
	
	@Autowired
	BillingAddressRepo billingAddressRepo;
	
	@Autowired
	ShippingAddressRepo shippingAddressRepo;
	
	@Autowired
	CartRepo cartRepo;
	
	@Autowired
	CustomerRepo customerRepo;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Override
	// add all sales order
	public String addSalesOrder(SalesOrderRequest salesOrderRequest) {
		// TODO Auto-generated method stub
		SalesOrder salesOrder = new SalesOrder();
		salesOrder.setBillingAddress(billingAddressRepo.getById(salesOrderRequest.getBillingAddressId()));
		salesOrder.setShippingAddress(shippingAddressRepo.getById(salesOrderRequest.getShippingAddressId()));
		salesOrder.setCart(cartRepo.getById(salesOrderRequest.getCartId()));
		salesOrder.setCustomer(customerRepo.getById(salesOrderRequest.getCustomerId()));
		salesOrder = salesOrderRepo.save(salesOrder);
		LOGGER.info("Record Added Successfully");
		return "Sales Order Added Successfully";
	}
	@Override
	// delete sales order by id
	public String deleteSalesOrder(int salesOrderId) {
		// TODO Auto-generated method stub
		Optional<SalesOrder> optionalSalesOrder = salesOrderRepo.findById(salesOrderId);
		if (optionalSalesOrder.isPresent()) {
			salesOrderRepo.deleteById(optionalSalesOrder.get().getSales_order_id());
			LOGGER.info("Sales order deleted successfully");
			return "Sales Order deleted successfully";
		} else {
			LOGGER.info("Sales Order not found");
			return "Sales Order info not Deleted";
		}
	}

	@Override
	// getting sales order list
	public List<SalesOrder> getAllSalesOrder() {
		// TODO Auto-generated method stub
		return salesOrderRepo.findAll();
	}

	@Override
	// get sales order by id
	public String getSalesOrderByid(int salesOrderId) {
		// TODO Auto-generated method stub
		Optional<SalesOrder> optionalSalesOrder = salesOrderRepo.findById(salesOrderId);
		if (optionalSalesOrder.isPresent()) {
			salesOrderRepo.findById(optionalSalesOrder.get().getSales_order_id());
			LOGGER.info("Record Found Successfully");
			return "Record Found Successfully";
		} else {
			LOGGER.info("Record not Found");
			return "Sales Order not found";

		}

	}
}
