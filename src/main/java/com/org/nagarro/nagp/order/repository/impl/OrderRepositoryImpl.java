package com.org.nagarro.nagp.order.repository.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.org.nagarro.nagp.order.entity.Order;
import com.org.nagarro.nagp.order.repository.OrderRepository;

@Service
public class OrderRepositoryImpl implements OrderRepository {

	@Override
	public List<Order> getAllOrdersByuserId(String userId) {
		List<Order> orders = Arrays.asList(new Order("1", 250, "14-Apr-2020"), new Order("1", 260, "15-Apr-2020"));
		return orders;
	}

}
