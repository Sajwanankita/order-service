package com.org.nagarro.nagp.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.nagarro.nagp.order.entity.Order;
import com.org.nagarro.nagp.order.service.OrderService;

@RequestMapping(value = "/orders")
@RestController
public class OrderController {
	private OrderService orderService;

	@Autowired
	OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@GetMapping(value = "/{userId}")
	public List<Order> getuserById(@PathVariable(value = "userId") String userId) {
		return orderService.getAllOrdersByuserId(userId);
	}

}
