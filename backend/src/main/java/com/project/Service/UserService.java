package com.project.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.Entity.Product;
import com.project.Entity.User;

@Service
public interface UserService {
	public User createUser(User usr);
	public User showdatabyid(Long u);
	public List<User> getData();
	
	
	
}
