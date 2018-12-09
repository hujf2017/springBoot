package com.hd.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages={"com.hd.controller","com.hd.job"})
@EnableScheduling
public class SpringApp {
	public static void main(String[] args){
		SpringApplication.run(SpringApp.class, args);
	}
}
