package com.yash;

public class DemoBean {

	public String message;

	public DemoBean(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void show() {
		System.out.println(" Some Logic Here ");
	}
}