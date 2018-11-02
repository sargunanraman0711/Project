package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ClassController {
	@RequestMapping("/")
	public String Home()
	{
		return "index";
		
		
	}
	@RequestMapping("/contactus")
	public String ContactUs()
	{
		return "ContactUs";
		
		
	}
	
	@RequestMapping("/logo")
	public String Logo()
	{
		return "Logo";
		
		
	}

	@RequestMapping("/aboutus")
	public String AboutUs()
	{
		return "AboutUs";
		
		
	}
	
	@RequestMapping("/login")
	public String Home2(HttpSession Session)
	{
		return "login";
		
		
	}
	
	@RequestMapping("/register")
	public String showRegister()
	{
		return "register";
		
		
	}
	
	
	
	@RequestMapping("/adminhome")
	public String Home4()
	{
		return "UserHome";
		
		
	}
	
	
	
	
	
	
	
	

}
