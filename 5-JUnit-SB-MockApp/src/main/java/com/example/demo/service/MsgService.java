package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MsgService {

	public String welcomeMsg() {
		return "Welcome to house";
	}
	
	public String greetMsg() {
		return "Good Evening";
	}
}
