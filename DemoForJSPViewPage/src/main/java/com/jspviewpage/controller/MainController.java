package com.jspviewpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String home()
	{
		System.out.println("home is executing");
		return "home";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		System.out.println("This is contact page");
		return "contact";
	}
}
