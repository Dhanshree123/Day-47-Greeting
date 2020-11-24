package com.greetingSpring.model;

public class Greeting {
	private int id;
	private String message;

	public Greeting(int id,String message) {
		this.id=id;
		this.message=message;
	}
	public int getId() {
		return this.id;
	}
	public String getMessage() {
		return this.message;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setMessage(String message) {
		this.message=message;
	}
}
