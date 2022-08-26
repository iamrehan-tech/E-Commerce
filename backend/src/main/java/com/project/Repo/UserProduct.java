package com.project.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.Entity.Product;
import com.project.Entity.User;
@Repository
public interface UserProduct  extends JpaRepository<Product,Long>{

	List<Product> findByproductname(String productname);
	@Query(value = "SELECT * FROM product l WHERE l.productprice <= ?1", 
			nativeQuery = true)
	public List<Product> findItemsByminPrice(int productprice);
	@Query(value = "SELECT * FROM product l WHERE l.productprice >= ?1", 
			nativeQuery = true)
	public List<Product> findItemsBymaxPrice(int productprice);
	
	
	
}
