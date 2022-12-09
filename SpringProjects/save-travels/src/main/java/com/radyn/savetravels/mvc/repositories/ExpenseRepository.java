package com.radyn.savetravels.mvc.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.radyn.savetravels.mvc.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense,Long>{
	List<Expense> findAll();
	Optional<Expense> findOneById(Long id);

}
