package com.org.nagarro.nagp.order.repository.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.nagarro.nagp.order.entity.Order;
import com.org.nagarro.nagp.order.repository.OrderRepository;

import io.opentracing.Span;
import io.opentracing.Tracer;

@Service
public class OrderRepositoryImpl implements OrderRepository {

	private Tracer tracer;

	@Autowired
	OrderRepositoryImpl(Tracer tracer) {
		this.tracer = tracer;
	}

	@Override
	public List<Order> getAllOrdersByuserId(String userId, Span rootSpan) {
		Span span = tracer.buildSpan("Order Repository : Get all orders by user id").asChildOf(rootSpan).start();
		List<Order> orders = Arrays.asList(new Order("1", 250, "14-Apr-2020"), new Order("1", 260, "15-Apr-2020"));
		span.finish();
		return orders;
	}

}
