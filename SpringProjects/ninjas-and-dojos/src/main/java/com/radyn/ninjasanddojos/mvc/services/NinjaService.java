package com.radyn.ninjasanddojos.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.radyn.ninjasanddojos.mvc.models.Ninja;
import com.radyn.ninjasanddojos.mvc.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;

	NinjaService(NinjaRepository ninjaRepository){
		this.ninjaRepository = ninjaRepository;
	
	}
	
//	Create
	public Ninja create(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
//	Read
	public List<Ninja> getAll(){
		return ninjaRepository.findAll();
	}
	public Ninja getOne(Long id) {
		return ninjaRepository.findOneById(id);
	}
//	Update
	public Ninja update(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
//	Delete
	public void delete(Long id) {
		ninjaRepository.deleteById(id);
	}
}
