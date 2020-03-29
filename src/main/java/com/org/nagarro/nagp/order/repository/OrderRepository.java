package com.org.nagarro.nagp.order.repository;

import java.util.List;

import com.org.nagarro.nagp.order.entity.Order;

public interface OrderRepository {
	
	List<Order> getAllOrdersByuserId(String userId);

}
