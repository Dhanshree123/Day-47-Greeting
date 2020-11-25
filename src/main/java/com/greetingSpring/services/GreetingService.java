package com.greetingSpring.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.greetingSpring.model.Greeting;
import com.greetingSpring.model.User;

@Service
public class GreetingService implements IGreetingService {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Override
	public Greeting addGreeting(User user) {
		String message = "Hello World";
		return new Greeting(counter.incrementAndGet(),message);
	}

	@Override
	public Greeting getGreetingById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
