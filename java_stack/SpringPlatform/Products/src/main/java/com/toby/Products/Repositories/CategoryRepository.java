package com.toby.Products.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.toby.Products.models.Category;



public interface CategoryRepository extends CrudRepository<Category, Long> {
	
	List<Category>findAll();
}
