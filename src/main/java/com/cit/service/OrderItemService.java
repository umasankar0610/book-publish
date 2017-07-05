package com.cit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cit.model.OrderItem;
import com.cit.repository.BookRepository;
import com.cit.repository.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;
	
	
	@Autowired
	private BookRepository bookRepository;

	public void save(OrderItem orderItem)
	{
		orderItemRepository.save(orderItem);
	}

	public BookRepository getBookRepository() {
		return bookRepository;
	}

	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}


	
	
}
