package com.project.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {

	public Category() {
		super();
	}


	public Category(Long categoryId, String categorytitle, String categorydescription) {
		super();
		CategoryId = categoryId;
		this.categorytitle = categorytitle;
		this.categorydescription = categorydescription;
		
	}


	public Long getCategoryId() {
		return CategoryId;
	}


	public void setCategoryId(Long categoryId) {
		CategoryId = categoryId;
	}


	public String getCategorytitle() {
		return categorytitle;
	}


	public void setCategorytitle(String categorytitle) {
		this.categorytitle = categorytitle;
	}


	public String getCategorydescription() {
		return categorydescription;
	}


	public void setCategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}





	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long CategoryId;
	
	@Column
	private String categorytitle;
	@Column
	private String categorydescription;
	
	

	
}
