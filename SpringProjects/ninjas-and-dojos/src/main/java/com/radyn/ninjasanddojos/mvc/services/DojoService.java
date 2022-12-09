package com.radyn.ninjasanddojos.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.radyn.ninjasanddojos.mvc.models.Dojo;
import com.radyn.ninjasanddojos.mvc.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepository;
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
//	Create
	public Dojo create(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
//	Read
	public List<Dojo> getAll(){
		return dojoRepository.findAll();
	}
	public Dojo getOne(Long id) {
		return dojoRepository.findOneById(id);
	}

//	Update
	public Dojo update(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
//	Delete
	public void delete(Long id) {
		dojoRepository.deleteById(id);
	}
}
