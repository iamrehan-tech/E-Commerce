package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.Entity.Product;
import com.project.Service.ProductService;

public class SearchController {
	
	@Autowired
	ProductService productservice;
	
//	   @GetMapping("/searchbyname")
//	    public ResponseEntity<?> searchProducts(@RequestParam("productname") String name) {
//	        try {
//	            return new ResponseEntity<List<Product>>(productservice.searchProductByName(name), HttpStatus.OK);
//	        } catch (Exception e) {
//	            return new ResponseEntity<String>(e.toString(),HttpStatus.BAD_GATEWAY);
//	        }
//	    }

	    // User can search product by product price
//	    @GetMapping("/user/search_product_byPrice")
//	    public ResponseEntity<?> searchProductsPrice(@RequestParam("price") String price) {
//	        try {
//	            return new ResponseEntity<List<Product>>(userProductService.searchProducts(price), HttpStatus.OK);
//	        } catch (Exception e) {
//	            System.out.println(e);
//	            return new ResponseEntity<String>(e.toString(),HttpStatus.BAD_GATEWAY);
//	        }
//	    }

}
