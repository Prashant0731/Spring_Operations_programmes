package com.yash;

import java.util.Set;

public class WelcomeBean {

	private Set<?> employeeData;

	public void setEmployeeData(Set<?> employeeData) {
		this.employeeData = employeeData;
	}
	
	public void show() {
		System.out.println(employeeData);
	}
}
