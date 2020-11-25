package com.greetingSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greetingSpring.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {

}