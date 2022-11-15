package com.via.variables;

public class MyFirstProgram {
	
	public static int staticVar = 20;
	public static String name = "Smith";
	
	public static void main(String[] args) {
		
		
	//######## section1 ############	
		//overriding value assignment
		int varInt = 15;
		varInt = 100;
		varInt = 50;		
		System.out.println(varInt);
		
		// variable value cant be override when there is final keyword
		final int maxRating = 10;
//		maxRating = 100;
		System.out.println(maxRating);
		
		
	//####### section2 #############		
		String varString = "This is string";
		System.out.println("The string value: " + varString);
		
		int localVar = 10;
		System.out.println("Static variable value is: " + staticVar);
		System.out.println("Local variable value is: " + localVar);
		
		int salary = 50000;
		System.out.println(name  +  " Salary is: " + salary);
	}
}
