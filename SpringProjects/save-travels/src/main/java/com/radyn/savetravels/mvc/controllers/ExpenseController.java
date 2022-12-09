package com.radyn.savetravels.mvc.controllers;

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

import com.radyn.savetravels.mvc.models.Expense;
import com.radyn.savetravels.mvc.services.ExpenseService;

@Controller
@RequestMapping("/expense")
public class ExpenseController {
	private final ExpenseService expenseService;
	public ExpenseController(ExpenseService expenseService) {
		this.expenseService = expenseService;
		}
	
//	Create
	@PostMapping("")
	public String addExpense(@Valid @ModelAttribute("expense")Expense expense,BindingResult result,Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allExpenses",expenseService.getAll());
			return "home.jsp";
		}
		expenseService.create(expense);
		return "redirect:/expense";
		
	}
//	Read
	@GetMapping("")
	public String vewAll(@ModelAttribute("expense")Expense expense, BindingResult result,Model model) {
		model.addAttribute("allExpenses", expenseService.getAll());
		return "home.jsp";
	}
	@GetMapping("/view/{id}")
	public String viewOne(@PathVariable("id") Long id,Model model) {
		model.addAttribute("expense", expenseService.getOne(id));
		return "viewone.jsp";
		
	}

// Update
	@GetMapping("/{id}")
	public String edit(@PathVariable("id") Long id,Model model) {
		model.addAttribute("expense", expenseService.getOne(id));
		return "edit.jsp";
	}
	@PutMapping("/edit/{id}")
	public String editExpense(@Valid @ModelAttribute("expense")Expense expense,BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		expenseService.update(expense);
		return "redirect:/expense";
		
	}
//	Delete
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id" ) Long id) {
		expenseService.delete(id);
		return "redirect:/expense";
	}


}

