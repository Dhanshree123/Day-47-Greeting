package com.greetingSpring.services;

import com.greetingSpring.model.Greeting;
import com.greetingSpring.model.User;

public interface IGreetingService {
	Greeting addGreeting(User user);
	Greeting getGreetingById(long id);

}
