package com.cit.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cit.model.Book;
import com.cit.service.BookService;

@Controller
@RequestMapping(value="Book")
public class BookController {
	
	
	@Autowired
	public BookService bookservice;
	
    @GetMapping
	public String listBooks(ModelMap modelMap, HttpSession session) {
System.out.println("BookController called");
		List<Book> books = bookservice.findAll();
		System.out.println(books);
		
		modelMap.addAttribute("books", books);
		return "booklist";
		
		
	}
	

    @GetMapping("/{id}")
    public String View(@PathVariable("id") int id,HttpSession session)
    {
    	System.out.println(" detail page called");
    System.out.println("viewbook"+id);    
    Book book=bookservice.findOne(id);

    session.setAttribute("selectbook", book);
    return "details";
    
    }

	
}
