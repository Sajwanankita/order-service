package com.org.nagarro.nagp.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.nagarro.nagp.order.entity.Order;
import com.org.nagarro.nagp.order.service.OrderService;

import io.opentracing.Span;
import io.opentracing.Tracer;

@RequestMapping(value = "/orders")
@RestController
public class OrderController {
	private OrderService orderService;
	private Tracer tracer;

	@Autowired
	OrderController(OrderService orderService, Tracer tracer) {
		this.orderService = orderService;
		this.tracer = tracer;
	}

	@GetMapping(value = "/{userId}")
	public List<Order> getOrderByUserId(@PathVariable(value = "userId") String userId) {
		List<Order> orders = new ArrayList<>();
		Span span = tracer.buildSpan("Order Controller : Get all orders by user id").start();
		orders = orderService.getAllOrdersByuserId(userId, span);
		span.finish();
		return orders;

	}

}
