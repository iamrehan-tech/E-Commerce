package com.project.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.Entity.Category;
import com.project.Repo.UserCategory;
import com.project.Service.CategoryService;

@Component
public class UserCategoryimpl implements CategoryService {
	
	@Autowired
	UserCategory usercategory;

	@Override
	public Category createCategory(Category category) {
		usercategory.save(category);
		return category;
	}

}
