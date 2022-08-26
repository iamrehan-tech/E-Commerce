package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entity.Category;
import com.project.Entity.Product;
import com.project.Service.CategoryService;
import com.project.Service.ProductService;

@RestController
public class CategoryController {

	@Autowired
	CategoryService categoryservice;
	
	@PostMapping("/category")
	public ResponseEntity<Category> createProduct(@RequestBody Category category) {
		return new ResponseEntity<>(categoryservice.createCategory(category), HttpStatus.CREATED);
	}
	
}
