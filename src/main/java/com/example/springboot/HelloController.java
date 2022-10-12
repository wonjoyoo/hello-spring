package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		System.out.println("무엇이 문제일까");
		return "Greetings from Spring Boot + Tanzu!. live update. oh my god. good.";
	}

}