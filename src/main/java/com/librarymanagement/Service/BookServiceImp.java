package com.librarymanagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.librarymanagement.Repository.BookRepository;
import com.librarymanagement.entity.Book;

@Service
public class BookServiceImp implements BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	Book book=new Book();
	
	//get all book from repo
	@Override
	public List<Book> getAllBook() {
		
		return bookRepository.findAll();
	}
	
	 //get book by genre in repo
	@Override
	public List<Book> getBookGenre(String genre) {	
		return bookRepository.findByGenre(genre);
	}

	//save book in repo
	@Override
	public Book saveBook(Book book) {
		
		return bookRepository.save(book);
		
	}

	

	
    //update book by bookid in repo
	@Override
	public Book updateBook(Book book) {
		
		return bookRepository.save(book);

	}

	//delete book by bookid in repo 
	@Override
	public void deleteBook(long bookId) {
		bookRepository.deleteById(bookId);
		
		
	}
	

}
