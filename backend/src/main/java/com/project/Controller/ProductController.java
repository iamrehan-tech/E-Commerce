package com.project.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entity.Product;
import com.project.Service.ProductService;

@RestController
public class ProductController {

	
	@Autowired
	ProductService productservice;
	
	@GetMapping("/fetch")
	public List<Product> getallproduct() {
		
		 return productservice.getallproduct();
		
	}
	 
	
	@PostMapping("/product")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		
		List<String> ls=new ArrayList<>();
		String a=product.getServiceability();
		String b="";
		char r;
		for(int i = 0; i < a.length(); i++) {
			r=a.charAt(i);
			if(r!=',') {
				b+=a.charAt(i);
			}
			else {
				ls.add(b);
				b="";
			}
		}
		System.out.println(ls);
		
		return new ResponseEntity<>(productservice.createProduct(product), HttpStatus.CREATED);
	}
@GetMapping("/searchusingname/{name}")
	public List<Product> searchUsingName(@PathVariable("name") String name)
{
		return productservice.searchUsingName(name);	
}
	@GetMapping("/filterusingprice/{price}")
	public List<Product> filterUsingPrice(@PathVariable("price") int price)
	{
		return productservice.filterUsingPrice(price);
	}
}
