package com.cit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cit.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

	/*@Query(name = "SELECT SUM(a.qp) total_price FROM(SELECT quantity*price qp FROM order_items JOIN books ON books.id=order_items.book_id WHERE order_id=?1) a", nativeQuery = true)
	public Float findByOrder(Long orderId);
	
	
	@Query(name = "SELECT quantity*price qp FROM order_items JOIN books ON books.id=order_items.book_id WHERE order_id=?1", nativeQuery = true)
	public List<Integer> findByPrice(Long orderId);*/
}

	
	
	

