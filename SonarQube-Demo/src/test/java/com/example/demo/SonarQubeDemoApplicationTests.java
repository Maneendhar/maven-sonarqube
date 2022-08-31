package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarQubeDemoApplicationTests {

//	@Test
//	void contextLoads() {
//	}
//	
	@Autowired
	private Service service;

	@Test
	void getMessageTest() {
//		Mockito.when().thenReturn("Hello Human");
		Assertions.assertEquals("Hello Human", service.getMessage());
	}

	@Test
	void getDateTest() {
		Assertions.assertEquals("2022-08-30", service.getDate());
	}

	@Autowired
	private Controller controller;

	@Test
	void getMessageTest1() {
		Assertions.assertEquals("Hello Human", controller.getMessage());
	}

	@Test
	void getDateTest1() {
		Assertions.assertEquals("2022-08-30", controller.getDate());
	}

}
