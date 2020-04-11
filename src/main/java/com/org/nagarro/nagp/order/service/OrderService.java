package com.org.nagarro.nagp.order.service;

import java.util.List;

import com.org.nagarro.nagp.order.entity.Order;

import io.opentracing.Span;

public interface OrderService {

	List<Order> getAllOrdersByuserId(String userId, Span rootSpan);

}
