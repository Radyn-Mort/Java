package com.radyn.books.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.radyn.books.mvc.models.Book;
import com.radyn.books.mvc.services.BookService;

@Controller
public class BooksController {
	 private final BookService bookService ;
	 
	 public BooksController(BookService bookService){
	     this.bookService = bookService;
	 }

	@GetMapping("/display/book/{id}")
	public String getOne(@PathVariable("id") Long id, Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		System.out.println(book);
		return "display.jsp";
	}
	@GetMapping("/display/books")
	public String getAllBooks(Model model) {
		model.addAttribute("allBooks", bookService.allBooks());
		return "displayAll.jsp";
	}
}
