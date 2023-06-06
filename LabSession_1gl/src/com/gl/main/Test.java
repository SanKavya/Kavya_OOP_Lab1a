package com.gl.main;

import java.util.Random;
public class Test {
 public static void main(String[]args) {
	 Random r = new Random();
	 
	 
	 String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		     String numbers = "0123456789";		
	String SpecialCharacters = "!@#$%^&*()_+-=.?<>";    
		
	String values = capitalLetters + smallLetters +numbers + SpecialCharacters ;
	
	System.out.println(values.length());
	System.out.println(r.nextInt(values.length()));
	System.out.println(values.charAt(r.nextInt(values.length())));
	
 }
	public Test() {
		// TODO Auto-generated constructor stub
	}

}
