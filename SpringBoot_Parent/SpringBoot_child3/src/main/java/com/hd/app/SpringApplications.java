package com.hd.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

//@EnableAutoConfiguration
//@ComponentScan("com.hd.controller")//扫描包 
//默认扫描当前包或子包   组合注解  
@SpringBootApplication(scanBasePackages={"com.hd.controller","com.hd.interceptor"})
public class SpringApplications{
	@Bean//注入
	public HttpMessageConverters fastJsonMessageConverter(){
		//  创建fastjson的消息转换器
			FastJsonHttpMessageConverter  convert = new FastJsonHttpMessageConverter();
			//创建FastJson的配置对象
			FastJsonConfig config = new FastJsonConfig();
			//对jason数据进行格式化 PrettyFormat 格式化常量
			config.setSerializerFeatures(SerializerFeature.PrettyFormat);
			
			convert.setFastJsonConfig(config);
			
			HttpMessageConverter<?> con =convert;
			
			return new HttpMessageConverters(con);
			
	 }
	
	
	public static void main(String[] args){
		SpringApplication.run(SpringApplications.class, args);
	}



/*public class SpringApplications extends WebMvcConfigurerAdapter{ //继承WebMvcConfigurerAdapter  从而实现Fastjson
	
	
	
	public static void main(String[] args){
		SpringApplication.run(SpringApplications.class, args);
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		//  创建fastjson的消息转换器
		FastJsonHttpMessageConverter  convert = new FastJsonHttpMessageConverter();
		//创建FastJson的配置对象
		FastJsonConfig config = new FastJsonConfig();
		//对jason数据进行格式化 PrettyFormat 格式化常量
		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
		convert.setFastJsonConfig(config);
		converters.add(convert);
	}
}*/


	
}