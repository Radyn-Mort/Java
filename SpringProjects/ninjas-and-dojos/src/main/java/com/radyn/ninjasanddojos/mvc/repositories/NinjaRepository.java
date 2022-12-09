package com.radyn.ninjasanddojos.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.radyn.ninjasanddojos.mvc.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja,Long>{
List<Ninja> findAll();

Ninja findOneById(Long id);
}
