package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Testing {
	@RequestMapping("/log")
	public String Try()
	{
		return "home";
		
		
	}
}
