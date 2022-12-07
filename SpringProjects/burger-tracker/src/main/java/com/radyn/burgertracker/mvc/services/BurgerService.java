package com.radyn.burgertracker.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.radyn.burgertracker.mvc.models.Burger;
import com.radyn.burgertracker.mvc.repositories.BurgerRepository;
@Service
public class BurgerService {
	private final BurgerRepository burgerRepository;
	
	public BurgerService(BurgerRepository burgerRepository) {
		this.burgerRepository = burgerRepository;
	}
	
	public List<Burger> findAll(){
		return burgerRepository.findAll();
	}
	
	public Burger createBurger(Burger burger) {
		return burgerRepository.save(burger);
	}
	
}
