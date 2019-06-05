package com.collabera.rest.springboothelloworld.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello world!!!";
	}
	
}
