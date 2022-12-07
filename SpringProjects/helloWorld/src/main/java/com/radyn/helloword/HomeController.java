package com.radyn.helloword;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {
	@RequestMapping("")
	public String index() {
		return "hello World";
	}
	@RequestMapping("/world")
	public String World() {
		return "Class level annotations are cool";
	}
	@RequestMapping("/")
	public String helloName(@RequestParam(value="name") String name , @RequestParam(value="lastName",required=false) String lastName ) {
		if(lastName != null) {
		return "Hello " + name +" "+ lastName;
		}
		return "Hello " + name;
	}
	
	@RequestMapping("/{name}/{lastName}/{from}")
	public String helloNameFrom(@PathVariable("name") String name, @PathVariable("lastName") String lastName,
			@PathVariable("from") String from) {
		if(lastName != null) {
		return "Hello " + name +" "+ lastName + " from "+ from ;
		}
		return "Hello " + name;
	}
}
