package com.radyn.savetravels.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.radyn.savetravels.mvc.models.Expense;
import com.radyn.savetravels.mvc.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepository;
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
//	Create
	public Expense create(Expense expense) {
		return expenseRepository.save(expense);
	}
//	Read
	public List<Expense> getAll() {
		return expenseRepository.findAll();
	}
	public Expense getOne(Long id ) {

		return expenseRepository.findOneById(id).orElse(null);
	}
//	Update
	public Expense update(Expense expense) {
		return expenseRepository.save(expense);
	}
//	Delete
	public void delete(Long id ) {
		expenseRepository.deleteById(id);
	}

}
