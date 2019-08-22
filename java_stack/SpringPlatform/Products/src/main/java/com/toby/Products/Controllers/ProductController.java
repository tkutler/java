package com.toby.Products.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toby.Products.Services.ProductService;
import com.toby.Products.models.Category;
import com.toby.Products.models.Product;

@Controller
public class ProductController {
    private final ProductService productService;
	
    //initializes services
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    //to new product page
    @RequestMapping("/products/new")
    public String newDojo(@ModelAttribute("products") Product product) {
        return "/Products/newproject.jsp";
    }
    //adds new product
    @RequestMapping(value="/newproduct", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("products") Product product, BindingResult result) {
        if (result.hasErrors()) {
        	System.out.println("ERROR");
            return "/Products/newproject.jsp";
        } else
        	System.out.println(product);
            productService.createProduct(product);
            return "redirect:/products/new";
        }
    //to new product page
    @RequestMapping("/categories/new")
    public String newCategory(@ModelAttribute("categories") Category category) {
        return "/Products/newcategory.jsp";
    }
    //adds new product
    @RequestMapping(value="/newcategory", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("categories") Category category, BindingResult result) {
        if (result.hasErrors()) {
        	System.out.println("ERROR");
            return "/Products/newcategory.jsp";
        } else
        	System.out.println(category);
            productService.createCategory(category);
            return "redirect:/categories/new";
        }
    //to product info page 
    @RequestMapping(value="/products/{id}", method=RequestMethod.GET)
    public String show(Model model, @PathVariable(value="id") Long id) {
    	Product product = productService.findProduct(id);
    	model.addAttribute("products", product);
        List<Category> categories = productService.allCategories();
        model.addAttribute("categories", categories);
    	return "Products/ShowProduct.jsp";
    }
    //adds new category to product
    @RequestMapping(value="/newProductCategory", method=RequestMethod.POST)
    public String insert(@Valid @ModelAttribute("products") Product productcat, BindingResult result) {
        if (result.hasErrors()) {
        	System.out.println("ERROR");
            return "/Products/ShowProduct.jsp";
        } else
        	System.out.println(productcat);
            productService.createProductCategory(productcat);
            return "redirect:/categories/new";
        }
    //to product info page 
    @RequestMapping(value="/categories/{id}", method=RequestMethod.GET)
    public String showCategories(Model model, @PathVariable(value="id") Long id) {
    	Category category = productService.findCategory(id);
    	model.addAttribute("categories", category);
        List<Product> products = productService.allProducts();
        model.addAttribute("products", products);
    	return "Products/ShowCategory.jsp";
    }
    //adds new product to category
    @RequestMapping(value="/newCategoryProduct", method=RequestMethod.POST)
    public String join(@Valid @ModelAttribute("categories") Category category, BindingResult result) {
        if (result.hasErrors()) {
        	System.out.println("ERROR");
            return "/Products/ShowCategory.jsp";
        } else
        	System.out.println(category);
            productService.createCategoryProduct(category);
            return "redirect:/products/new";
        }
}
