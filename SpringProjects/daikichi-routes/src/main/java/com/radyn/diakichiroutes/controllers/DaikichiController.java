package com.radyn.diakichiroutes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
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
}
