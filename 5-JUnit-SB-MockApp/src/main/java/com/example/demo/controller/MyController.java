package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.MsgService;

@Controller
public class MyController {

	@Autowired
	private MsgService service;
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		String msg = service.welcomeMsg();
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public ResponseEntity<String> greet(){
		String msg = service.greetMsg();
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
