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
	//@ResponseBody //���ϴ�ע�⣬����resuktful,��ʹ��ע�⣬�������ת
	public String yes(){
		return "hello";
		}
	
	@RequestMapping("/ok")
	//@ResponseBody
	public String ok(){
		return "ok";
	}
}
