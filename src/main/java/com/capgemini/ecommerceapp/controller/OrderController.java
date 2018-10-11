package com.capgemini.ecommerceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ecommerceapp.entity.LineItems;
import com.capgemini.ecommerceapp.entity.Orders;
import com.capgemini.ecommerceapp.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;

	@PostMapping("/orders")
	public ResponseEntity<Orders> addOrder(@RequestBody Orders order) {
		orderService.submitOrder(order);
		Orders order1 = orderService.getOrderById(order.getOrderId());
		return new ResponseEntity<Orders>(order1, HttpStatus.OK);
	}

	@PostMapping("/orders/{orderId}")
	public ResponseEntity<Orders> cancelOrder(@PathVariable int orderId) {
		orderService.cancelOrder(orderId);
		Orders order1 = orderService.getOrderById(orderId);
		return new ResponseEntity<Orders>(order1, HttpStatus.OK);
	}

	@DeleteMapping("/orders")
	public ResponseEntity<Orders> deleteOrder(@RequestParam int orderId) {
		orderService.deleteOrder(orderId);
		Orders order1 = orderService.getOrderById(orderId);
		return new ResponseEntity<Orders>(order1, HttpStatus.OK);
	}

	@PutMapping("/orders")
	public ResponseEntity<Orders> updateOrder(@RequestBody Orders order) {
		orderService.updateOrder(order);
		Orders order1 = orderService.getOrderById(order.getOrderId());
		return new ResponseEntity<Orders>(order1, HttpStatus.OK);
	}

	@GetMapping("/orders/{orderId}")
	public ResponseEntity<Orders> getOrder(@PathVariable int orderId) {
		Orders order1 = orderService.getOrderById(orderId);
		if (order1.getOrderId() == orderId) {
			return new ResponseEntity<Orders>(order1, HttpStatus.OK);
		}
		return new ResponseEntity<Orders>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/orders")
	public ResponseEntity<List> getAllOrder() {
		List<Orders> order1 = orderService.getOrders();
		return new ResponseEntity<List>(order1, HttpStatus.OK);
	}
	
	@PostMapping("/lineitems")
	public ResponseEntity<LineItems> addLineItems(@RequestBody LineItems items){
		orderService.addLineItem(items);
		return new ResponseEntity<LineItems>(items, HttpStatus.OK);
	}
	
	@DeleteMapping("/lineitems")
	public ResponseEntity<LineItems> removeLineItems(@RequestBody LineItems items){
		orderService.removeLineItem(items);
		return new ResponseEntity<LineItems>(items, HttpStatus.OK);
	}
	@GetMapping("/lineitems")
	public ResponseEntity<List> getAllLineItems() {
		List<LineItems> items = orderService.getItems();
		return new ResponseEntity<List>(items, HttpStatus.OK);
	}
}
