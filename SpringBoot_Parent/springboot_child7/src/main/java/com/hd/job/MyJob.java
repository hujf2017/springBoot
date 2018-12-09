package com.hd.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyJob {
		
		@Scheduled(fixedRate=1000)//√ø∏Ù1000ms÷¥––
		public  void run(){
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		}
}
