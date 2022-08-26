package com.project.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.Entity.Product;
import com.project.Entity.User;
import com.project.Repo.UserProduct;
import com.project.Repo.UserRepo;
import com.project.Service.UserService;

@Component
public class UserImpl implements UserService {

	@Autowired
	UserRepo userrepo;
	
	
	
	@Override
	public User createUser(User usr) {
		userrepo.save(usr);
		return usr;
	}

	@Override
	public User showdatabyid(Long u) {
		userrepo.findById(u);
		return (User) userrepo;
	}

	@Override
	public List<User> getData() {
		System.out.println(userrepo.findAll());
		return userrepo.findAll();
		
	}





}
