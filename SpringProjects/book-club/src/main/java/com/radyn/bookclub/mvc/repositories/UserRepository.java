package com.radyn.bookclub.mvc.repositories;



import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.radyn.bookclub.mvc.models.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{
public List<User> findAll();
Optional<User> findUserByEmail(String email);
Optional<User> findById(Long id);


}
