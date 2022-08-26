package com.project.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entity.Product;
import com.project.Repo.UserProduct;
@Service
public interface ProductService {
	
	public List<Product> getallproduct();
	
	
	public Product createProduct(Product product);


	public List<Product> searchUsingName(String name);


	public List<Product> filterUsingPrice(int price);


	
	
	//serarch product by name  //
	
	/* public Product searchProductByName(Product code) ; */
	
	
}
