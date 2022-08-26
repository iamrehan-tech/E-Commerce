package com.project.Service;

import org.springframework.stereotype.Service;

import com.project.Entity.Category;

@Service
public interface CategoryService {
	
	public Category createCategory(Category category);

}
