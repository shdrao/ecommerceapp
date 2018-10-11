package com.capgemini.ecommerceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.ecommerceapp.entity.LineItems;
import com.capgemini.ecommerceapp.entity.Orders;
@Service
public interface OrderService {
	public List<Orders> getOrders();//

	public Orders getOrderById(int orderId);//

	public void submitOrder(Orders order);//

	public void updateOrder(Orders order);//

	public void deleteOrder(int orderId);//

	public void cancelOrder(int orderId);//

	public void addLineItem(LineItems item);//

	public void removeLineItem(LineItems item);//

	public List<LineItems> getItems();//
}
