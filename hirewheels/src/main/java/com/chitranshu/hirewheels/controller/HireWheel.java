package com.chitranshu.hirewheels.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chitranshu.hirewheels.services.InitService;

@RestController
public class HireWheel {
	@Autowired 
	InitService initService;
	
	@GetMapping("/start")
	String start() {
		initService.start();
		return "True";
	}
}
