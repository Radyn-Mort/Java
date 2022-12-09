package com.radyn.ninjasanddojos.mvc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.radyn.ninjasanddojos.mvc.models.Dojo;
import com.radyn.ninjasanddojos.mvc.services.DojoService;

@Controller
@RequestMapping("/dojos")
public class DojoController {
	private final DojoService dojoService;
	public DojoController(DojoService dojoService) {
		this.dojoService = dojoService;
	}
//Create
@GetMapping("")
public String dojoForm(@ModelAttribute("dojo") Dojo dojo) {
	return "dojos/create.jsp";
	
}
@PostMapping("")
public String newDojo(@Valid @ModelAttribute("dojo") Dojo dojo,BindingResult result) {
	if(result.hasErrors()) {
		return"/dojos/create.jsp";
	}
	dojoService.create(dojo);

//	best way to reroute to dojo?
	return "redirect:/dojos/all";
}
//	Read
@GetMapping("/{id}")
public String viewOne(@PathVariable("id")Long id,Model model) {
	model.addAttribute("dojo", dojoService.getOne(id));
	return "dojos/viewDojo.jsp";
}
@GetMapping("/all")
public String viewAll(Model model) {
	model.addAttribute("allDojos",dojoService.getAll());
	return "/dojos/alldojos.jsp";
}
//	Update
//	Delete

}
