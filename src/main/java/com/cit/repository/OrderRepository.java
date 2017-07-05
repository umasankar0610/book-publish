package com.cit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cit.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{
	

public List<Order> findByUserIdOrderByIdDesc(int id);
	
	public List<Order> findByOrderByIdDesc();
	

	

}
