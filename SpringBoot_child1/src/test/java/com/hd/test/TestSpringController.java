package com.hd.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.hd.controller.SpringController;

import junit.framework.TestCase;

@SpringBootTest(classes=SpringController.class)//≤‚ ‘À≠
@RunWith(SpringJUnit4ClassRunner.class)//À≠¿¥≤‚ ‘
@WebAppConfiguration//web’˚∫œ
public class TestSpringController {
	@Autowired
	private SpringController springcontroller;
	@Test
	public void test1(){
		TestCase.assertEquals(this.springcontroller.yes(), "hello1");
	}
}
