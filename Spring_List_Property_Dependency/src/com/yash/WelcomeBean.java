package com.yash;

import java.util.List;

public class WelcomeBean {

	private List employeeData;

	public void setEmployeeData(List employeeData) {
		this.employeeData = employeeData;
	}
	
	public void show() {
		System.out.println(employeeData);
	}
}
