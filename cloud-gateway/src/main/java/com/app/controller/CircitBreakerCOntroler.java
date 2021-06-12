package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircitBreakerCOntroler {
	
	@GetMapping("/userServiceFollBack")
	public String userServiceFollBack() {
		return "please wait something is going on server side";
	}
	@GetMapping("/departmentServiceFollBack")
	public String departmentServiceFollBack() {
		return "please wait something is going on server side";
	}

}
