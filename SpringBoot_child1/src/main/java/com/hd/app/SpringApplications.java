package com.hd.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
//@ComponentScan("com.hd.controller")//扫描包 
//默认扫描当前包或子包   组合注解
@SpringBootApplication(scanBasePackages={"com.hd.controller"})
public class SpringApplications {
	public static void main(String[] args){
		SpringApplication.run(SpringApplications.class, args);
	}
}
