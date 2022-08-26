package com.project.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long productId;
	@Column
	private String productname;
	
	@Column
	private String producdesc;
	@Column
	private String pphotos;
	@Column(length=2000)
	private int productprice;
	
	
	
	@Column
	private String productlocation;
	
	@Column
	private String productdiscount;
	
	@Column
	private String serviceability;
	
	@Column
	private String productbrand;
	
	@Column
	private String productcode;

	public Product(Long productId, String productname, String producdesc, String pphotos, int productprice,
			String productlocation, String productdiscount, String serviceability, String productbrand,
			String productcode) {
		super();
		this.productId = productId;
		this.productname = productname;
		this.producdesc = producdesc;
		this.pphotos = pphotos;
		this.productprice = productprice;
		this.productlocation = productlocation;
		this.productdiscount = productdiscount;
		this.serviceability = serviceability;
		this.productbrand = productbrand;
		this.productcode = productcode;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProducdesc() {
		return producdesc;
	}

	public void setProducdesc(String producdesc) {
		this.producdesc = producdesc;
	}

	public String getPphotos() {
		return pphotos;
	}

	public void setPphotos(String pphotos) {
		this.pphotos = pphotos;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public String getProductlocation() {
		return productlocation;
	}

	public void setProductlocation(String productlocation) {
		this.productlocation = productlocation;
	}

	public String getProductdiscount() {
		return productdiscount;
	}

	public void setProductdiscount(String productdiscount) {
		this.productdiscount = productdiscount;
	}

	public String getServiceability() {
		return serviceability;
	}

	public void setServiceability(String serviceability) {
		this.serviceability = serviceability;
	}

	public String getProductbrand() {
		return productbrand;
	}

	public void setProductbrand(String productbrand) {
		this.productbrand = productbrand;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productname=" + productname + ", producdesc=" + producdesc
				+ ", pphotos=" + pphotos + ", productprice=" + productprice + ", productlocation=" + productlocation
				+ ", productdiscount=" + productdiscount + ", serviceability=" + serviceability + ", productbrand="
				+ productbrand + ", productcode=" + productcode + "]";
	}

	


}
