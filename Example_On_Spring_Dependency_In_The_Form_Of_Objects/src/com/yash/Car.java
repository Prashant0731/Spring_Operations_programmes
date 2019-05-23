package com.yash;

public class Car implements Vechicle{

	private String fuelType;
	private int maxSpeed;
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void move() {
		System.out.println(" Fuel Type :"+fuelType);
		System.out.println(" Max Speed :"+maxSpeed);
		System.out.println(" Car Started ...........");
	}
}
