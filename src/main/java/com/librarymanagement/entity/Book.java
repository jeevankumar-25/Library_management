package com.librarymanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	

	//if you need to auto generate use"@GeneratedValue(strategy = GenerationType.IDENTITY)"
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="bookId")
	Long bookId;
	
	@Column(name="quantity")
	int quantity;
	
	@Column(name="bookName")
	String bookName;
	
	@Column(name="genre")
	String genre;
	
	
	//default constructor
	 public Book() {
		  
	  }
	
	// constructor with parameter
	public Book(Long bookId, int quantity, String bookName, String genre) {
		
		this.bookId = bookId;
		this.quantity = quantity;
		this.bookName = bookName;
		this.genre = genre;
	}

	//getters and setters

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
	

}
