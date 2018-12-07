package com.hd.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

//@EnableAutoConfiguration
//@ComponentScan("com.hd.controller")//扫描包 
//默认扫描当前包或子包   组合注解  
@SpringBootApplication(scanBasePackages={"com.hd.controller","com.hd.service","com.hd.serviceimpl"})
@EnableAsync//开启异步调用
public class SpringApplications{
	
	public static void main(String[] args){
		SpringApplication.run(SpringApplications.class, args);
	}

}