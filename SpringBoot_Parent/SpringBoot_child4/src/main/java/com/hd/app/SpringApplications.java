package com.hd.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

//@EnableAutoConfiguration
//@ComponentScan("com.hd.controller")//ɨ��� 
//Ĭ��ɨ�赱ǰ�����Ӱ�   ���ע��  
@SpringBootApplication(scanBasePackages={"com.hd.controller","com.hd.service","com.hd.serviceimpl"})
@EnableAsync//�����첽����
public class SpringApplications{
	
	public static void main(String[] args){
		SpringApplication.run(SpringApplications.class, args);
	}

}