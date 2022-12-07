package com.radyn.burgertracker.mvc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.radyn.burgertracker.mvc.models.Burger;
import com.radyn.burgertracker.mvc.services.BurgerService;

@Controller
@RequestMapping("/burger")
public class BurgerController {
	private final BurgerService burgerService;
	public BurgerController(BurgerService burgerService) {
		this.burgerService = burgerService;
	}
	
	@GetMapping("/all")
	public String getAllBurgers(@ModelAttribute("burger") Burger burger,BindingResult result, Model model) {
		model.addAttribute("allBurgers", burgerService.findAll());
		return "index.jsp";
	}
	
	@PostMapping("/add")
	public String addBurger(@Valid @ModelAttribute("burger") Burger burger,BindingResult result,Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allBurgers", burgerService.findAll());
			return "index.jsp";
		}
		else {
			burgerService.createBurger(burger);
			return "redirect:/burger/all";
		}
	}
	
}
