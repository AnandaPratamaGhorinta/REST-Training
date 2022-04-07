package com.widetech.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.widetech.training.domain.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository <OrderItem ,Long>{

}
