package com.librarymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.librarymanagement.Service.BookService;
import com.librarymanagement.entity.Book;

@RestController
public class BookController {
	
	@Autowired
	public BookService bookService;
	
	
   //request for getting all books data
	@GetMapping(path="/getBooks")
	public List<Book> getAllBook() {
		return bookService.getAllBook();
	} 
	
	//request for getting books by genre
	@GetMapping(path="/getByType/{genre}")
	public List<Book> getBookGenre(@PathVariable String genre) {
		return bookService.getBookGenre(genre);
	} 
	
	
	//request to save book data
	@PostMapping(path="/saveBook")
	public Book saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
		
	} 
	
	
    //request to update the book data
	@PutMapping(path="/editBook/{bookId}")
	public Book updateBook(@PathVariable long bookId,@RequestBody Book book) {
		book.setBookId(bookId);
		return bookService.updateBook(book);
	} 
	
	//request to delete book by id
	@DeleteMapping(path="/deleteBook/{bookId}")
	public void deleteBook(@PathVariable long bookId) {
		bookService.deleteBook(bookId);
	} 

	
	
	
	
	
}
