package com.hd.serviceimpl;

import java.util.Random;
import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import com.hd.service.AsyncService;

@Service
public class AsyncServiceImpl implements AsyncService {

	private static Random random = new Random();
	
	@Async
	public Future<String> doTask1() throws Exception {
		System.out.println("任务一开始执行");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end =System.currentTimeMillis();
		System.out.println("任务一结束：耗时："+(end-start));
		return new AsyncResult<String>("任务一结束");
	}
	@Async
	public Future<String> doTask2() throws Exception {
		System.out.println("任务二开始执行");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end =System.currentTimeMillis();
		System.out.println("任务二结束：耗时："+(end-start));
		return new AsyncResult<String>("任务二结束");
	}
	@Async
	public Future<String> doTask3() throws Exception {
		System.out.println("任务三开始执行");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end =System.currentTimeMillis();
		System.out.println("任务三结束：耗时："+(end-start));
		return new AsyncResult<String>("任务三结束");
	}

}
