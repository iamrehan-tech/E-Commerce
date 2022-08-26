package com.project.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.Entity.Product;
import com.project.Entity.User;
import com.project.Repo.UserProduct;
import com.project.Service.ProductService;
import com.project.Service.UserService;

@Component
public class UserProductimpl implements ProductService {
	@Autowired
	UserProduct userproduct;

	@Override
	public Product createProduct(Product product) {
		userproduct.save(product);
		return null;
	}

	@Override
	public List<Product> getallproduct() {

		return userproduct.findAll();
	}

	@Override
	public List<Product> searchUsingName(String name) {
		List<Product> allproducts = userproduct.findAll();
		System.out.println(allproducts);
		List<Product> ls = new ArrayList<>();
		for (Product p : allproducts) {
			if (p.getProductname().equals(name) || p.getProductbrand().equals(name)
					|| p.getProductcode().equals(name)) {

				ls.add(p);

			}
			System.out.println(ls);
		}
		return ls;

	}

	@Override
	public List<Product> filterUsingPrice(int price) {
		if (price <= 10000) {
			List<Product> productPrice = userproduct.findItemsByminPrice(price);
			System.out.println(productPrice);
			return productPrice;
		}

		else {
			List<Product> productmaxPrice = userproduct.findItemsBymaxPrice(price);
			System.out.println(productmaxPrice);
			return productmaxPrice;

		}
	}

}
