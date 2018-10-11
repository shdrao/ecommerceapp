package com.capgemini.ecommerceapp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lineitems")
public class LineItems {
	@Id
	private int itemId;
	private int itemQuantity;
	private int productid;

	public LineItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LineItems(int itemId, int itemQuantity, int productid) {
		super();
		this.itemId = itemId;
		this.itemQuantity = itemQuantity;
		this.productid = productid;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	@Override
	public String toString() {
		return "LineItems [itemId=" + itemId + ", itemQuantity=" + itemQuantity + ", productid=" + productid + "]";
	}

}
