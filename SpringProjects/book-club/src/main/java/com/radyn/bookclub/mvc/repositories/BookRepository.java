package com.radyn.bookclub.mvc.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.radyn.bookclub.mvc.models.Book;
@Repository
public interface BookRepository extends CrudRepository<Book,Long> {
	
	public List<Book> findAll();
	
	public Optional<Book> findById(Long id); 
	

}
