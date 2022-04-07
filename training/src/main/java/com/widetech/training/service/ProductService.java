package com.widetech.training.service;

import java.util.List;
import java.util.Optional;
import com.widetech.training.domain.Product;

public interface ProductService {
	
	List<Product> getAllProduct();
	Optional<Product> findByid(int id);
	Product saveContact(Product product);
	Product updateProduct(int id , Product product);
	void deleteById(int id);
}

