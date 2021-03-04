package com.learn.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContainer {
	
	
	@GetMapping("/dk-hello-world")
	public String helloWorldContainer() {
		return "Hello Docker and Kubernetes!!!";
	}

}
