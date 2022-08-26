package com.model;

public class Product {
	
	
	private String productname;
	

	private String producdesc;

	private String pphotos;
	
	private int productprice;
	
	
	
	

	private String productlocation;
	
	
	private String productdiscount;

	private String serviceability;

	private String productbrand;
	
	
	private String productcode;

	public Product(Long productId, String productname, String producdesc, String pphotos, int productprice,
			 String productlocation, String productdiscount, String serviceability,
			String productbrand, String productcode) {
		super();
		
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

	@Override
	public String toString() {
		return "Product [productname=" + productname + ", producdesc=" + producdesc + ", pphotos=" + pphotos
				+ ", productprice=" + productprice + ", productlocation=" + productlocation + ", productdiscount="
				+ productdiscount + ", serviceability=" + serviceability + ", productbrand=" + productbrand
				+ ", productcode=" + productcode + "]";
	}
	

}

