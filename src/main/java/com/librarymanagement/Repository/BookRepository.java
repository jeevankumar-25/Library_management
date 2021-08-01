package com.librarymanagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.librarymanagement.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long>{

	List<Book> findByGenre(String genre);

	void deleteByBookId(long bookId);

	


}