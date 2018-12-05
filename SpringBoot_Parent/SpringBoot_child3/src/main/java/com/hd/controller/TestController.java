package com.hd.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hd.pojo.Person;

@Controller
public class TestController {
	
	
	@RequestMapping("/person")
	@ResponseBody
	public Object show(){ 
		Person ren = new Person();
		ren.setId(66);
		ren.setName("ºú½£·å");
		ren.setDate(new Date());
		return ren;
	}
}
