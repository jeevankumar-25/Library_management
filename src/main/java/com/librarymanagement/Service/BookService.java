package com.librarymanagement.Service;

import java.util.List;

import com.librarymanagement.entity.Book;

public interface BookService {
	public Book saveBook(Book book);	
	public List<Book> getAllBook();
	public List<Book> getBookGenre(String genre);
	public Book updateBook(Book book);
	public void deleteBook(long bookId);


}
