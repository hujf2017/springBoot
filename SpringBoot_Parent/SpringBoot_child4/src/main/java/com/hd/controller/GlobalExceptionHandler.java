package com.hd.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//一场作为通知
@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String,Object> handleException(Exception exception){
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("errorcode", 500);
		map.put("errorMsg", exception.toString());
			
		return map;
		
	}
}
