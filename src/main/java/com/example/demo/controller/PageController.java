package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping("/Portfolio")
	public String welcomePage() {
		
		 return "welcomepage.html";
		
	}
	
	@GetMapping("/skills")
	public String skillsPage() {
		
		  return "skillspage.html";
	}
	
	@GetMapping("/projects")
	public String projectsPage() {
		
		  return "projectspage.html";
	}
	
	@GetMapping("/achievements")
	public String achievementsPage() {
		
		  return "achievementspage.html";
	}

}
