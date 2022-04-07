package com.widetech.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.widetech.training.domain.Product;
import com.widetech.training.repositories.RepositoryProduct;

@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	private RepositoryProduct pr;
	
	@Override
	public List<Product> getAllProduct() {
		return pr.findAll();
	}
	
	public Optional<Product> findByid(int id){
		return pr.findById(id);
	}
	
    public Product saveContact(Product product) {
        return pr.save(product);
    }
	
	public Product updateProduct(int id , Product product) {
		Product updatedProduct = pr.findById(id).orElse(null);
		updatedProduct.setName(product.getName());
		updatedProduct.setCode(product.getCode());
		updatedProduct.setType(product.getType());
		updatedProduct.setPrice(product.getPrice());
		return pr.save(updatedProduct);
	}
	
	public void deleteById(int id) {
		pr.deleteById(id);
	}

	

}
