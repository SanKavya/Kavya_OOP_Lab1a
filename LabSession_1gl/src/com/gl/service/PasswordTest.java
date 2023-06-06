package com.gl.service;

import java.util.Random;

public class PasswordTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int length =8;
		String password = passwordGen(length);
		for(int i=0;i<10;i++) {
			System.out.println(new Random().nextInt(8));
		}
		System.out.println(password);
	}
	
	private static String passwordGen(int length) {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		     String numbers = "0123456789";		
	String SpecialCharacters = "!@#$%^&*()_+-=.?<>";    
		
	String values = capitalLetters + smallLetters +numbers + SpecialCharacters ;
	
	
	String password="";
	for(int i=0;i<length;i++) {
		   password+=values.charAt(new Random().nextInt(values.length()));
	}
	return password;
	}


	public PasswordTest() {
		// TODO Auto-generated constructor stub
	}

	
}
