package com.hd.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

//@EnableAutoConfiguration
//@ComponentScan("com.hd.controller")//ɨ��� 
//Ĭ��ɨ�赱ǰ�����Ӱ�   ���ע��  
@SpringBootApplication(scanBasePackages="com.hd.controller")
public class SpringApplications extends WebMvcConfigurerAdapter{ //�̳�WebMvcConfigurerAdapter  �Ӷ�ʵ��Fastjson
	
	
	
	public static void main(String[] args){
		SpringApplication.run(SpringApplications.class, args);
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		//  ����fastjson����Ϣת����
		FastJsonHttpMessageConverter  convert = new FastJsonHttpMessageConverter();
		//����FastJson�����ö���
		FastJsonConfig config = new FastJsonConfig();
		//��jason���ݽ��и�ʽ�� PrettyFormat ��ʽ������
		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
		convert.setFastJsonConfig(config);
		converters.add(convert);
	}
}
