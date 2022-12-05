package com.radyn.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@GetMapping("/display")
	public String display() {
		return "display.jsp";
	}
	
	@PostMapping("/submit")
	public String submit(@RequestParam(value="number") Integer number,
			@RequestParam(value="city") String city,
			@RequestParam(value="name") String name,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="animal") String animal,
			@RequestParam(value="nice") String nice,
			HttpSession session) {
		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("animal", animal);
		session.setAttribute("nice ", nice);
		return "redirect:/display";
	}
	@GetMapping("/form")
	public String form() {
		return "form.jsp";
	}
}
