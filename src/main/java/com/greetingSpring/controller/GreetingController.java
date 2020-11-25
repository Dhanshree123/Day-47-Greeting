package com.greetingSpring.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greetingSpring.model.Greeting;
import com.greetingSpring.model.User;
import com.greetingSpring.services.IGreetingService;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
	
	@Autowired
	private IGreetingService greetingService;
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("")
	public Greeting greeting(@RequestParam(value="name",defaultValue="World") String name){
		User user = new User(name,"Seema");
		return greetingService.addGreeting(user);
	}

}