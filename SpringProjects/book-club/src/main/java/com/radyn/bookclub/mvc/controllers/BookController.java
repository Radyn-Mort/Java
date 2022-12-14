package com.radyn.bookclub.mvc.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.radyn.bookclub.mvc.models.Book;
import com.radyn.bookclub.mvc.models.User;
import com.radyn.bookclub.mvc.services.BookService;
import com.radyn.bookclub.mvc.services.UserService;

@Controller
@RequestMapping("/books")
public class BookController {
//	is it better to take userServ into a third controller for methods that use both
	private final BookService bookServ;
	private final UserService userServ;
	public BookController( BookService bookServ,UserService userServ) {
		this.bookServ = bookServ;
		this.userServ =userServ;
	}
	
//	Create
	@GetMapping("")
	public String displeBookForm(@ModelAttribute("book") Book book, BindingResult result,HttpSession session,Model model){
		if(session.getAttribute("user_id")==null) {
			return "redirect:/users/register";
		}
		model.addAttribute("user", userServ.getById((Long)session.getAttribute("user_id")));
		return "bookForm.jsp";
	}
	
	@PostMapping("")
	public String addBook(@Valid @ModelAttribute("book") Book book,BindingResult result,HttpSession session) {
		if(result.hasErrors()) {
			return "bookForm.jsp";
		}
		bookServ.create(book);
		return "redirect:books/home";
	}
//	Read
	@GetMapping("/home")
	public String allBooks(Model model,HttpSession session) {
		if(session.getAttribute("user_id")==null) {
			return "redirect:/users/register";
		}
		User user = userServ.getById((Long)session.getAttribute("user_id"));
		model.addAttribute("user", user);
		model.addAttribute("allBooks", bookServ.getAll());
		return "home.jsp";
		
	}
	@GetMapping("/view/{id}")
	public String viewOne(@PathVariable("id")Long bookId,HttpSession session, Model model) {
		model.addAttribute("book", bookServ.getOne(bookId));
//		what is the naming convention for jsp
		return "viewBook.jsp";
		
	}
//	Update
	@GetMapping("/{id}")
	public String displayEditBook(@PathVariable("id") Long bookId,Model model,HttpSession session) {
//		Better way to do this?
		User user = userServ.getById((Long)session.getAttribute("user_id"));
		model.addAttribute("user", user);
		model.addAttribute("book",bookServ.getOne(bookId));

		return "editBook.jsp";
	}
	@PutMapping("/{id}")
	public String editBook(@Valid @ModelAttribute("book")Book book,BindingResult result,  Model model,HttpSession session) {
		
		if(result.hasErrors()) {
			System.out.println(result.getErrorCount());
			User user = userServ.getById((Long)session.getAttribute("user_id"));
			model.addAttribute("user", user);
			return "editBook.jsp";
		}
		
		bookServ.update(book);
		return "redirect:/books/home";
	}
//	Delete
	
	@DeleteMapping("/{id}")
	public String deleteBook(@PathVariable("id") Long id,HttpSession session ) {
		Book book = bookServ.getOne(id);
		Long sessionId = (Long) session.getAttribute("user_id");
		Long userId = book.getUser().getId();
		System.out.println("user id from session");
		System.out.println(sessionId);
		
		System.out.println("user id from user");
		System.out.println(userId);
		if(!sessionId.equals(userId)) {
			System.out.println("delete check 2");
			return "redirect:/books/home";
		}
		System.out.println("delete check 3");
		bookServ.delete(id);
		return "redirect:/books/home";
	}

}
