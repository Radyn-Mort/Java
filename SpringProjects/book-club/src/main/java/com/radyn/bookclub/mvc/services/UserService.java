package com.radyn.bookclub.mvc.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.radyn.bookclub.mvc.models.LoginUser;
import com.radyn.bookclub.mvc.models.User;
import com.radyn.bookclub.mvc.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepo;
	public UserService(UserRepository userRepo) {
		this.userRepo =userRepo;
	}
	
//	Create
	public User validateCreate(User user,BindingResult result) {
		
		if(!(user.getPassword().equals(user.getConPass()))) {
			result.rejectValue("password","match", "Passwords do not match");
			
		}

		if(this.getByEmail(user.getEmail()) != null) {
			result.rejectValue("email","unique", "Email already in use");
			
		}
		if(result.hasErrors()) {
			return null;
		}

		
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return user;
	}
	

	public User create(User user) {
		return userRepo.save(user);
	}
	
//	Read
	public User getOne(String email) {
		return userRepo.findUserByEmail(email).orElse(null);
	}
	public List<User> getAll(){
		return userRepo.findAll();
	}
	public User getByEmail(String email){
		Optional<User> foundUser= userRepo.findUserByEmail(email);
		return foundUser.orElse(null);
		
	}
	public User getById(Long id ) {
		Optional<User> foundUser = userRepo.findById(id);
		return foundUser.orElse(null);
	}
	
//	Validations
	public boolean validateLogin(LoginUser loginUser,BindingResult result) {
		User checkedUser = this.getByEmail(loginUser.getEmail());
		boolean isValid = true;
		if(checkedUser == null) {
			result.rejectValue("email","match", "email not found");
			isValid =false;
		}

		if(!(BCrypt.checkpw(loginUser.getPassword(),checkedUser.getPassword()))) {
		System.out.println(checkedUser.getPassword());
		System.out.println(loginUser.getPassword());
			result.rejectValue("password"," match","password doesnt match");
			isValid =false;
		}
		return isValid;
		}
}
