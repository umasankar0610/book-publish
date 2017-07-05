package com.cit.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book") 
public class Book {
	
	@Id
	private int id;
	private String bookname;
	private String authorname;
	 private LocalDate publishdate;
	 private float price ;
	  private String content;
	  private String status;
	  public Book()
	  {
		  
	  }
	public Book(int id, String bookname, String authorname, LocalDate publishdate, float price, String content,
			String status) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.authorname = authorname;
		this.publishdate = publishdate;
		this.price = price;
		this.content = content;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public LocalDate getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(LocalDate publishdate) {
		this.publishdate = publishdate;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	  @Override
	  public String toString()
	  {
		  return id+" "+bookname+""+authorname+""+publishdate+""+price+""+content+""+status;
	  }

}
