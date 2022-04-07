package com.widetech.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.widetech.training.domain.Order;
import com.widetech.training.domain.Product;
import com.widetech.training.repositories.OrderRepository;
import com.widetech.training.service.OrderServiceImpl;

@RestController
public class OrderController {
	private OrderServiceImpl orderService;
	
	public OrderController(OrderServiceImpl orderService) {
		this.orderService=orderService;
	}
	
	@GetMapping("/order")
		public List<Order> getOrders(){
		return orderService.findAll();
	}
	
	 @GetMapping("/viewOrder")
		public  ModelAndView viewOrder(Model model) {
		model.addAttribute("order",orderService.findAll());
		return new ModelAndView("OrderPage");}
}
