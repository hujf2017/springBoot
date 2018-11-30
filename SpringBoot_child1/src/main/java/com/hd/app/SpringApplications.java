package com.hd.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
//@ComponentScan("com.hd.controller")//ɨ��� 
//Ĭ��ɨ�赱ǰ�����Ӱ�   ���ע��
@SpringBootApplication(scanBasePackages={"com.hd.controller"})
public class SpringApplications {
	public static void main(String[] args){
		SpringApplication.run(SpringApplications.class, args);
	}
}
