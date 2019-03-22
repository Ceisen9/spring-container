package com.containerize.spring.springcontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringContainerApplication {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Docker World";
	}
	@RequestMapping("/hello-aaron")
	public String sayHelloToAaron() {
		return "<img src='http://i.imgur.com/bK2AFVa.jpg' />";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringContainerApplication.class, args);
	}
}