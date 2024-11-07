package com.example.BookClub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookClub.models.Book;
import com.example.BookClub.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Book findById(Long id) {
		
		Optional<Book> result = bookRepository.findById(id);
		if(result.isPresent()) {
			return result.get();
		}
		
		return null;
	}
	
	public List<Book> all() {
		return bookRepository.findAll();
	}
	
	public Book create(Book book) {
		return bookRepository.save(book);
	}
	 public void delete(Long id) {
	        bookRepository.deleteById(id);
	    }
}