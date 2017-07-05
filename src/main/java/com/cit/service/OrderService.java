package com.cit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cit.model.Order;
import com.cit.repository.OrderItemRepository;
import com.cit.repository.OrderRepository;

@Service

public class OrderService {

	
	@Autowired
	private OrderRepository orderRepository;

	
	@Autowired
	private OrderItemRepository orderItemrepository;
	
	public void save(Order order) {
		orderRepository.save(order);
		
	}
	
	public List<Order> findAllOrders(){
		return orderRepository.findByOrderByIdDesc();
	}
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findOne(int id){
		return orderRepository.findOne(id);
	}
	
	public List<Order> findByUserIdOrderByIdDesc(int userId){
		return orderRepository.findByUserIdOrderByIdDesc(userId);
	}

	public OrderItemRepository getOrderItemrepository() {
		return orderItemrepository;
	}

	public void setOrderItemrepository(OrderItemRepository orderItemrepository) {
		this.orderItemrepository = orderItemrepository;
	}

	
	
}
