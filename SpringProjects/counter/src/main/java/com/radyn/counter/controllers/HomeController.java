package com.radyn.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


	@GetMapping("/home")
	public String home(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count",0);
		}
		int temp = (int)session.getAttribute("count")+1; 
		session.setAttribute("count", temp);
		return "index.jsp";
	}
	
	@GetMapping("/count")
	public String count() {
		return "displayCount.jsp";
	}
	@GetMapping("/clear")
	public String clear(HttpSession session) {
		session.removeAttribute("count");
		return "redirect:/home";

	}
}
