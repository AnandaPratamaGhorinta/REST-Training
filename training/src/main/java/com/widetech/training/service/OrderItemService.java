package com.widetech.training.service;

import java.util.List;

import com.widetech.training.domain.OrderItem;

public interface OrderItemService {
	 List <OrderItem> findAll();
	 OrderItem findById(int id);
	 OrderItem updateItems(int id, OrderItem items);
	 OrderItem saveItems(OrderItem items);
	 void deleteById(int id);
}
