package com.widetech.training.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.widetech.training.domain.Product;


@Repository
public interface RepositoryProduct extends JpaRepository<Product, Integer> {
	
}
