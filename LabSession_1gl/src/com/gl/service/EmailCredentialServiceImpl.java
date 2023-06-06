package com.gl.service;

import java.util.Random;

import com.gl.model.EmployeeDetails;

public class EmailCredentialServiceImpl implements EmailcredentialService {


	public String generateEmailAddress(EmployeeDetails emp, String department) {
		// TODO Auto-generated method stub
		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() +"@" + department + ".gl.com";
	}

	public String generatePassword() {
	  String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		     String numbers = "0123456789";		
	String SpecialCharacters = "!@#$%^&*()_+-=.?<>";    
		
	String values = capitalLetters + smallLetters +numbers + SpecialCharacters ;
	  Random random = new Random ();
	  String password = "";
	  for (int i = 0; i<8;i++) {
		  password += values.charAt(random.nextInt(values.length()));
	  }
	return password;
	}

	public void showCredentials(EmployeeDetails employee, String department) {
		System.out.println("Dear" + employee.getFirstName()+ "your generated credentials are as follows");
		System.out.println("Your Password:"+ generatePassword());
		System.out.println("Your Email :"+ generateEmailAddress(employee,department));
		
	}

}
