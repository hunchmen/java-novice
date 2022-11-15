package com.via.variables;

public class MyFirstProgram {
	
	public static void main(String[] args) {
		
		//overriding value assignment
		int varInt = 15;
		varInt = 100;
		varInt = 50;		
		System.out.println(varInt);
		
		// variable value cant be override when there is final keyword
		final int maxRating = 10;
//		maxRating = 100;
		System.out.println(maxRating);
	}
}
