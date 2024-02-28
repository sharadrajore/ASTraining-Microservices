package com.zensar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Hidden;

@RestController
//@Controller  //  Web Application 
@Hidden
public class HelloController {
	
	// http://localhost:8080/hello
	//@GetMapping("/hello")   // handler method     // Multi action controller
	@RequestMapping(value = "/hello",method=RequestMethod.GET)
	//@ResponseBody
	public String sayHello() {
		System.out.println("com.zensar package");
		return "<h2>Welcome to Spring Boot</h2>";   //logical name of the view
	}
	

}
