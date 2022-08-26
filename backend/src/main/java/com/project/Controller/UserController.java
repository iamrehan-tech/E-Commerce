package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entity.Product;
import com.project.Entity.User;
import com.project.Service.UserService;

@RestController
//@RequestMapping("nagarro")
public class UserController {

	@Autowired
	UserService userservice;
	
	
	@PostMapping("/add")
	public ResponseEntity<User> createUser(@RequestBody User usr) {
		return new ResponseEntity<>(userservice.createUser(usr), HttpStatus.CREATED);
	}
	

	@GetMapping("/getdata")
	public List<User> getData() {
		
		return userservice.getData();
	}

	
	@RequestMapping(path="fetch")
	@GetMapping("/")
	public ResponseEntity<User> showdata(@RequestBody Long usr) {
		return new ResponseEntity<>(userservice.showdatabyid(usr), HttpStatus.OK);
	}
	
	
}
