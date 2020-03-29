package com.org.nagarro.nagp.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

	private String orderId;
	private int orderAmount;
	private String orderDate;
}
