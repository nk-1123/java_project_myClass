package com.training.java8;

import java.util.Objects;

public class Product {
	int prodId;
	String prodName;
	String prodCategory;
	int price;
	
	public Product(int prodId, String prodName, String prodCategory, int price) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCategory = prodCategory;
		this.price = price;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "Product id is: " + this.prodId + ", product name is: " + this.prodName + ", product category is: " + this.prodCategory + ", price is: " + this.price;
	}

	@Override
	public int hashCode() {
		return this.prodId; //dont have to write sab kuch!!!! so override hashcode and equals
	}

	@Override
	public boolean equals(Object obj) {
		
		Product other = (Product) obj;
		return price == other.price && Objects.equals(prodCategory, other.prodCategory) && prodId == other.prodId
				&& Objects.equals(prodName, other.prodName);
	}
	
	
}
