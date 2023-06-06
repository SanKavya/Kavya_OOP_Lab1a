package com.gl.model;

public class EmployeeDetails {
	private String FirstName;
	private String LastName;
	public EmployeeDetails(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	

}
