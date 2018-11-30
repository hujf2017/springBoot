package com.hd.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class SpringController {
	
	@RequestMapping("/hi")
	//@ResponseBody //带上此注解，返回resuktful,不使用注解，会进行跳转
	public String yes(){
		return "hello";
		}
	
	@RequestMapping("/ok")
	//@ResponseBody
	public String ok(){
		return "ok";
	}
}
