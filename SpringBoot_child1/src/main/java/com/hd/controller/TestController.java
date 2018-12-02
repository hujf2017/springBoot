package com.hd.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	private Logger logger	=LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/show") 
	@ResponseBody
	public String show(){
		
		logger.debug("debug��־");
		logger.info("info��־");
		logger.warn("warn��־");
		logger.error("error��־");
		
		return "show";
		
	}
}
