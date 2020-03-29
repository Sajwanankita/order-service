package com.org.nagarro.nagp.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.nagarro.nagp.order.entity.Order;
import com.org.nagarro.nagp.order.repository.OrderRepository;
import com.org.nagarro.nagp.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	private OrderRepository orderRepository;

	@Autowired
	OrderServiceImpl(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public List<Order> getAllOrdersByuserId(String userId) {
		return orderRepository.getAllOrdersByuserId(userId);
	}

}
