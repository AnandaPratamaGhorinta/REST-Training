package com.widetech.training.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.widetech.training.domain.OrderItem;
import com.widetech.training.service.OrderItemServiceImpl;

@RestController
public class OrderItemController {

	OrderItemServiceImpl orderItemService;
	
	public OrderItemController(OrderItemServiceImpl orderItemService) {
		this.orderItemService = orderItemService;}
	
	@GetMapping("orderitem")
	public List<OrderItem> findAll(){
		return orderItemService.findAll();
	}
	
	 @GetMapping("/viewOrderItem")
		public  ModelAndView viewOrder(Model model) {
		model.addAttribute("orderitem",orderItemService.findAll());
		return new ModelAndView("OrderItemPage");}
}


