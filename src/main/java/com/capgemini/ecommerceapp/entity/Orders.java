package com.capgemini.ecommerceapp.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "orders")
public class Orders {
	@Id
	private int orderId;
	private double orderTotal;
	private LocalDate orderDate;
	private int customerId;
	private Set<LineItems> lineItems;
	private String orderStatus;

	
	public Orders() {
		super();
	}

	public Orders(int orderId, double orderTotal, LocalDate orderDate, int customerId, Set<LineItems> lineItems,
			String orderStatus) {
		super();
		this.orderId = orderId;
		this.orderTotal = orderTotal;
		this.orderDate = orderDate;
		this.customerId = customerId;
		this.lineItems = lineItems;
		this.orderStatus = orderStatus;
	}

	
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Set<LineItems> getLineItems() {
		return lineItems;
	}

	public void setLineItems(Set<LineItems> lineItems) {
		this.lineItems = lineItems;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderTotal=" + orderTotal + ", orderDate=" + orderDate
				+ ", customerId=" + customerId + ", lineItems=" + lineItems + ", orderStatus=" + orderStatus + "]";
	}
}
