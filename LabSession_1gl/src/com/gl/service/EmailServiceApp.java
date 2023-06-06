package com.gl.service;


import java.util.Scanner;

import com.gl.model.EmployeeDetails;
public class EmailServiceApp {
	

	public static void main(String[] args) {
		
		EmailCredentialServiceImpl service = new EmailCredentialServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name");
		String fn = sc.next();
		System.out.println("Enter your Last Name");
		String ln = sc.next();
		EmployeeDetails EmployeeDetails = new EmployeeDetails(fn,ln);
		
		System.out.println("Please enter your Department");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.legal");
		
		String department = null;

	}

}
