package com.gl.emailApp.dto;

public class Employee {
	private String department;
	private String firstName;
	private String lastName;
	
	public Employee(String department, String firstName, String lastName) {
		super();
		this.department = department;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
	
	

}
