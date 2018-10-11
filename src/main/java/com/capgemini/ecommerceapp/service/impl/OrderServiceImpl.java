package com.capgemini.ecommerceapp.service.impl;

import java.awt.geom.Line2D;
import java.util.List;
import java.util.Optional;

import javax.sound.sampled.Line;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.ecommerceapp.entity.LineItems;
import com.capgemini.ecommerceapp.entity.Orders;
import com.capgemini.ecommerceapp.repository.LineItemsRepository;
import com.capgemini.ecommerceapp.repository.OrderRepository;
import com.capgemini.ecommerceapp.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private LineItemsRepository lineItemsRepository;

	@Override
	public List<Orders> getOrders() {
		return orderRepository.findAll();
	}

	@Override
	public Orders getOrderById(int orderId) {
		Optional<Orders> optionalOrder = orderRepository.findById(orderId);
		if (optionalOrder.isPresent()) {
			return optionalOrder.get();
		}
		return optionalOrder.get();
	}

	@Override
	public void submitOrder(Orders order) {
		order.setOrderStatus("PLACED");
		orderRepository.save(order);
	}

	@Override
	public void updateOrder(Orders order) {
		Optional<Orders> optionalOrder = orderRepository.findById(order.getOrderId());
		if (optionalOrder.isPresent()) {
			orderRepository.save(order);
		}
	}

	@Override
	public void deleteOrder(int orderId) {
		Optional<Orders> optionalOrder = orderRepository.findById(orderId);
		if (optionalOrder.isPresent()) {
			Orders order1 = optionalOrder.get();
			order1.setOrderStatus("DELETED");
			orderRepository.save(order1);
		}
	}

	@Override
	public void cancelOrder(int orderId) {
		Optional<Orders> optionalOrder = orderRepository.findById(orderId);
		if (optionalOrder.isPresent()) {
			Orders order1 = optionalOrder.get();
			order1.setOrderStatus("CANCELLED");
			orderRepository.save(order1);
		}
	}

	@Override
	public void addLineItem(LineItems item) {
		lineItemsRepository.save(item);
	}

	@Override
	public void removeLineItem(LineItems item) {
		lineItemsRepository.delete(item);
	}

	@Override
	public List<LineItems> getItems() {
		return lineItemsRepository.findAll();
	}

}
