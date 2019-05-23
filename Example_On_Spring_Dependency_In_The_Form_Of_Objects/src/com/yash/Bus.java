package com.yash;

public class Bus implements Vechicle {

	private int maxSpeed;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void move() {
		System.out.println(" Max Speed :"+maxSpeed);
		System.out.println(" Bus started ............");
	}
}
