package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	Service service;

	@GetMapping("/getMessage")
	public String getMessage() {
		return service.getMessage();
	}

	@GetMapping("/getDate")
	public String getDate() {
		return service.getDate();
	}
}
