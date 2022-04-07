package com.widetech.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.widetech.training.domain.OrderItem;
import com.widetech.training.repositories.OrderItemRepository;

@Service
public class OrderItemServiceImpl implements OrderItemService{
	@Autowired
	OrderItemRepository orderItemRepo;
	
	
	@Override
	public List<OrderItem> findAll() {
		// TODO Auto-generated method stub
		return  orderItemRepo.findAll();
	}

	public OrderItem findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	public OrderItem updateItems(int id, OrderItem items) {
		// TODO Auto-generated method stub
		return null;
	}


	public OrderItem saveItems(OrderItem items) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}




	

}
