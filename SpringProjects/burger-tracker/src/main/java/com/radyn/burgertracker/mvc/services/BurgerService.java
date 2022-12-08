package com.radyn.burgertracker.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.radyn.burgertracker.mvc.models.Burger;
import com.radyn.burgertracker.mvc.repositories.BurgerRepository;
@Service
public class BurgerService {
//	Dependency Injection 
	private final BurgerRepository burgerRepository;

	public BurgerService(BurgerRepository burgerRepository) {
		this.burgerRepository = burgerRepository;
	}
//	Create
	public Burger createBurger(Burger burger) {
		return burgerRepository.save(burger);
	}
//	Read
	public List<Burger> findAll(){
		return burgerRepository.findAll();
	}
	public Burger findOne(Long id) {
		return burgerRepository.findById(id).orElse(null);
	}
// Update
	public Burger editBurger(Burger burger) {
		return burgerRepository.save(burger);
	}
	
// Delete
	
	
}
