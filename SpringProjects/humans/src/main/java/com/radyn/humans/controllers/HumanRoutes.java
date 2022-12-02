package com.radyn.humans.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanRoutes {

	@RequestMapping("/")
	public String helloName(@RequestParam(value="name" ,required=false) String name,
			@RequestParam(value="lName",required= false) String lName,
			@RequestParam(value="times",required=false) Integer times) {
		
		if(times !=null && name !=null && lName != null) {
			String greeting = "";
			for(int i = 0;i<times;i++) {
				greeting+= "hello " + name +" "+ lName +" ";
			}
			
			return greeting;
		}
		if(name !=null && lName != null) {
			return "hello " + name +" "+ lName;
		}
		if(name !=null) {
			return "hello " + name;
		}
		return "Human";
	}
}
