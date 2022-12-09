package com.radyn.ninjasanddojos.mvc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.radyn.ninjasanddojos.mvc.models.Ninja;
import com.radyn.ninjasanddojos.mvc.services.DojoService;
import com.radyn.ninjasanddojos.mvc.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	private final NinjaService ninjaService;
	private final DojoService dojoService;
	
	public NinjaController(NinjaService ninjaService,DojoService dojoService) {
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}
//Create
	@PostMapping("")
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja,BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allDojos", dojoService.getAll());
			return "/ninjas/create.jsp";
		}
		ninjaService.create(ninja);
		return "redirect:/dojos/all";
	}
	@GetMapping("")
	public String ninjaForm(@ModelAttribute("ninja") Ninja ninja , Model model) {
		model.addAttribute("allDojos",dojoService.getAll());
		return "/ninjas/create.jsp";
	}
//	Read
//	Update
//	Delete

	
	
}
