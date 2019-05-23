package com.yash;

public class Travel implements Journey{

	private Vechicle v;
	
	public void setVechicle(Vechicle v) {
		this.v=v;
	}
	
	public void startJourney() {
		System.out.println(" Journey has been Started ....");
		v.move();
	}
	
	
}
