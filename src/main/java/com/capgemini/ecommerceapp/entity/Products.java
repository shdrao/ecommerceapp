package com.capgemini.ecommerceapp.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "products")
public class Products {
	@Id
	private int productId;
	private String productName;
	private double productCost;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int productId, String productName, double productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "Orders [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost + "]";
	}

}
