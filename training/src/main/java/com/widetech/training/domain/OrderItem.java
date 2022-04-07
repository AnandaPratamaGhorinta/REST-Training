package com.widetech.training.domain;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="order_item")
public class OrderItem {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;

	  @Column
	  private int quantity;
	  
	  @JsonBackReference
	  @ManyToOne(fetch = FetchType.LAZY)
      @JoinColumn(name = "order_id", nullable = false)
      private Order order;
		  
	  @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	  @OneToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name = "product_id", nullable = false)
      private Product product;

	  public OrderItem() {}
	  
	  public OrderItem(int quantity, Order order) {
		  this.quantity=quantity;
		  this.order =order;
	  }
	  
	  public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void setProduct(Product product) {
		this.product=product;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int setPrice() {
		return (int) (quantity * product.getPrice());
	}

}
