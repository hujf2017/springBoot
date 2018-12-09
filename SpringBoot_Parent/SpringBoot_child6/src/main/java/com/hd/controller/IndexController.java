package com.hd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	
	@RequestMapping("/thymeleaf")
	public String show(Model model){
		
		model.addAttribute("word","уехЩ");
		return "tests";
	}
}
