package com.cit.service;


import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cit.model.Book;
import com.cit.repository.BookRepository;

@Service
public class BookService {
	private static final Logger LOGGER = LoggerFactory.getLogger(BookService.class);
@Autowired
private BookRepository bookrepository;

@Transactional
public List<Book> findAll()
{
	LOGGER.debug("Retrieving the list of all users");
	return bookrepository.findAll();
}

public Book findOne(int id) {
	// TODO Auto-generated method stub
	return bookrepository.findOne(id);
}


}