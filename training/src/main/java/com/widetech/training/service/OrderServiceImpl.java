package com.widetech.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.widetech.training.domain.Order;
import com.widetech.training.repositories.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderRepo;
	
	public Optional<Order> findById(Long id) {
		return orderRepo.findById(id);
	}

	public Order updateOrder(Long id, Order order) {
		Order updatedOrder = orderRepo.findById(id).orElse(null);
		updatedOrder.setItems(order.getItems());
		return orderRepo.save(order);
	}

	public Order saveOrder(Order order) {
		return orderRepo.save(order);
	}
	
	public void deleteById(Long id) {
		orderRepo.deleteById(id);
	}

	@Override
	public List<Order> findAll() {
		return orderRepo.findAll();
	}		
}
