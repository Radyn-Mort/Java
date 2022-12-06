package com.radyn.ninjagoldgame.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NinjaGold {

	@GetMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold",0);
		}
		if(session.getAttribute("log")==null) {
			ArrayList<String> log = new ArrayList<String>();
			session.setAttribute("log", log);
		}
		return "index.jsp";
	}
	@PostMapping("/gold")
	public String gold(HttpSession session, @RequestParam("choice") String choice) {
		int current =(int) session.getAttribute("gold");
		@SuppressWarnings("unchecked")
		ArrayList<String> newLog = (ArrayList<String>)session.getAttribute("log");
		Random rand = new Random();
		System.out.println(choice);
		
		if(choice.equals("farm")) {
			int temp = rand.nextInt(10+1)+10;
			String tempString ="You worked on a farm. You gained " +temp +" gold at: "+ new Date(); 
			newLog.add(tempString);
			session.setAttribute("log", newLog);
			session.setAttribute("gold", current +temp );
			
		}
		else if (choice.equals("cave")) {
			int temp = rand.nextInt(10+1)+5;
			String tempString ="You went to a cave. You gained " +temp +" gold at: "+ new Date(); 
			newLog.add(tempString);
			session.setAttribute("log", newLog);
			session.setAttribute("gold", current +temp );
			
		}
		else if (choice.equals("house")) {
			int temp = rand.nextInt(5+1)+2;
			String tempString ="You looked around your house. You gained " +temp +" gold at: "+ new Date(); 
			newLog.add(tempString);
			session.setAttribute("log", newLog);
			session.setAttribute("gold", current +temp );
			
		}
		else if(choice.equals("quest")) {
			int coin = rand.nextInt(2);
				if(coin == 0) {
					int temp = rand.nextInt(51);
					String tempString ="You went on an epic quest.You failed. You lost " +temp +" gold at: "+ new Date(); 
					newLog.add(tempString);
					session.setAttribute("log", newLog);
					session.setAttribute("gold", current -temp );
				}
				
				else {
					int temp = rand.nextInt(51);
					String tempString ="You went on an epic quest.You Succeded. You gained " +temp +" gold at: "+ new Date(); 
					newLog.add(tempString);
					session.setAttribute("log", newLog);
					session.setAttribute("gold", current +temp );
				}
			
		}
		else if(choice.equals("reset")){
			session.removeAttribute("gold");
		}
	return "redirect:/";
	}

	
	
}
