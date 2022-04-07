package com.widetech.training.service;

import java.util.List;
import java.util.Optional;
import com.widetech.training.domain.Order;


public interface OrderService {
	
	 List<Order> findAll();
	 Optional <Order> findById(Long id);
	 Order updateOrder(Long id, Order order);
	 Order saveOrder(Order order);
	 void deleteById(Long id);
}
