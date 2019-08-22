package com.toby.Products.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.toby.Products.Repositories.CategoryRepository;
import com.toby.Products.Repositories.ProductRepository;
import com.toby.Products.models.Category;
import com.toby.Products.models.Product;





@Service
public class ProductService {
	//adding dojo repository as dependency
	private final ProductRepository productRepository;
	private final CategoryRepository categoryRepository;
	
    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }
    // creates a product
    public Product createProduct(Product product) {
    	System.out.println("in create product service");
        return productRepository.save(product);
    }
    // creates a category for a product
    public Product createProductCategory(Product product) {
    	System.out.println("in create product category service");
        return productRepository.save(product);
    }
    // creates a product for a category
    public Category createCategoryProduct(Category category) {
    	System.out.println("in create category for product service");
        return categoryRepository.save(category);
    }
    //creates new category
    public Category createCategory(Category category) {
    	System.out.println("in create category service");
        return categoryRepository.save(category);
    }
    // finds product
    public Product findProduct(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            return null;
        }
    }
    // returns all the languages
    public List<Category> allCategories() {
        return categoryRepository.findAll();
    }
    // finds category
    public Category findCategory(Long id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if(optionalCategory.isPresent()) {
            return optionalCategory.get();
        } else {
            return null;
        }
    }
    // returns all the products
    public List<Product> allProducts() {
        return productRepository.findAll();
    }
    
}
