package com.jam.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/root/v1")
public class RootController {
	
	@GetMapping("/ping")
	public String ping() {
		return "Ping success - the root conroller is working";
	}

}
