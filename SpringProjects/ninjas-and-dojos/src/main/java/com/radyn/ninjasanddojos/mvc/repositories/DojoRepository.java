package com.radyn.ninjasanddojos.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.radyn.ninjasanddojos.mvc.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo,Long> {
	List<Dojo> findAll();
	
	Dojo findOneById(Long id);

}
