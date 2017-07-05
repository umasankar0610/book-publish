package com.cit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cit.model.Book;

public interface BookRepository extends JpaRepository <Book, Integer> {

}
