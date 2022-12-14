package com.radyn.bookclub.mvc.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.radyn.bookclub.mvc.models.LoginUser;
import com.radyn.bookclub.mvc.models.User;
import com.radyn.bookclub.mvc.services.UserService;


@Controller
@RequestMapping("/users")
public class UserController {
	private final UserService userServ;
	public UserController(UserService userServ) {
		this.userServ = userServ;
	}
	
//	Create
	@GetMapping("/register")
	public String registerForm(@ModelAttribute("user") User user,BindingResult result, Model model) {
		model.addAttribute("loginUser", new LoginUser());
		return "forms.jsp";
		
	}
	@PostMapping("/register")
	public String newUser(@Valid @ModelAttribute("user") User user,BindingResult result,Model model,HttpSession session) {
		
		User validatedUser = userServ.validateCreate(user,result);
		
		if(result.hasErrors()) {
			model.addAttribute("loginUser", new LoginUser());
			return "forms.jsp";
		}
		userServ.create(validatedUser);
		
		session.setAttribute("user_id", validatedUser.getId());
		
		return "redirect:/users/home";
	}
	@PostMapping("/login")
	public String loginValidation(@Valid @ModelAttribute("loginUser")LoginUser loginUser,BindingResult result,Model model,HttpSession session) {
		userServ.validateLogin(loginUser, result);
		
		if(result.hasErrors()) {
			model.addAttribute("user", new User());
			return "forms.jsp";
		}
		
		User user = userServ.getByEmail(loginUser.getEmail());
		session.setAttribute("user_id",user.getId() );
		
		return "redirect:/books/home";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user_id");
		return "redirect:/users/register";
	}
//	Read
	@GetMapping("/home")
	public String home(HttpSession session,Model model) {
//		fix this
		if(session.getAttribute("user_id")==null) {
			return "redirect:/users/register";
		}
		model.addAttribute("user", userServ.getById((Long) session.getAttribute("user_id")));
		return "home.jsp";
	}
}
