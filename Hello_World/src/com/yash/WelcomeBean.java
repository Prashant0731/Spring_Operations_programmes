package com.yash;

public class WelcomeBean {

	private String message;
	private Integer number;
	
	public void setMessage(String message) {
		this.message=message;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void show() {
		System.out.println("Message : "+message);
		System.out.println("Contect No : "+number);
		System.out.println();
	}
}