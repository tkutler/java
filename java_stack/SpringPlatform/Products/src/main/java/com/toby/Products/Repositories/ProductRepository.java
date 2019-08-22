package com.toby.Products.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.toby.Products.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	List<Product>findAll();
}
