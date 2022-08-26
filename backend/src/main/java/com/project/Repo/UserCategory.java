package com.project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Entity.Category;
import com.project.Entity.Product;
@Repository
public interface UserCategory  extends JpaRepository<Category,Long> {

}
