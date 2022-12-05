package com.radyn.diakichiroutes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/daikichi") this doesn't seem to be working using getmapping
public class DaikichiController {
	@RequestMapping("/")
	public String diakichi() {
		return "Welcome";
	}
	@GetMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	@GetMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@GetMapping("/m/daikichi/travel/{location}")
	public String travel(@PathVariable("location" ) String location) {
		return "Congrats you will soon go to " + location;
	}
	
	@GetMapping("/m/lotto/{number}")
	public String loto(@PathVariable("number") Integer number) {
		if(number%2 ==0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
}
