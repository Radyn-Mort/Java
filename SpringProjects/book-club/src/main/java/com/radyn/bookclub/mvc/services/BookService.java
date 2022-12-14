package com.radyn.bookclub.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.radyn.bookclub.mvc.models.Book;
import com.radyn.bookclub.mvc.repositories.BookRepository;
@Service
public class BookService {
	private final BookRepository bookRepo;
	public BookService(BookRepository bookRepo) {
		this.bookRepo =bookRepo;
	}
//	Create
	public Book create(Book book) {
		return bookRepo.save(book);
	}
// Read
	public List<Book> getAll(){
		return bookRepo.findAll();
	}
	
	public Book getOne(Long id ){
		return bookRepo.findById(id).orElse(null);
	}
	
// Update
	public Book update(Book book) {
		return bookRepo.save(book);
	}
// Delete
	public void delete(Long id) {
		bookRepo.deleteById(id);
	}
}
