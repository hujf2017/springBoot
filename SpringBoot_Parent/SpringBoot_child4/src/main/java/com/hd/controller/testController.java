package com.hd.controller;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hd.service.AsyncService;

@Controller
public class testController {
	
	@Autowired
	private AsyncService asyncservice;
	
	
	@RequestMapping("/show")
	@ResponseBody
	public String show(){
		int a=5/0;
		
		return "show";
	}
	
	
	@RequestMapping("/async")
	@ResponseBody
	public String asyncTest() throws Exception{
		
		long start = System.currentTimeMillis(); 
		Future<String> task1 = asyncservice.doTask1();
		Future<String> task2 = asyncservice.doTask2();
		Future<String> task3 = asyncservice.doTask3();
		
		while(true){
			if(task1.isDone()&& task2.isDone()&&task3.isDone()){
				break;
			}
			Thread.sleep(1000);
		}
		long end = System.currentTimeMillis();
		long time = end-start;
		return "全部执行完成，总耗时："+time ;
	}
}
