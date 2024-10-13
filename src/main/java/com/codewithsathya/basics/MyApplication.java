package com.codewithsathya.basics;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import com.codewithsathya.fundamentals.Types;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Java program");
		
//		1. Fundamentals
			//Types
			explainingTypes();
			explainingStrings();
			explainingArrays();
			explainingConstants();
			explainingOperators();
			//Control flows
			
			//package the application
		
//		2. OOPS
		
//		3. Core Java APIs
		
//		4. Advanced Features
		
		
	}
	
	private static void explainingOperators() {
		// TODO Auto-generated method stub
		/* 6 Arithmetic operators: 
		+
		-
		*
		/
		%
		*/
		int result = 10 / 3; //result is a whole number
		System.out.println(result);
		double resultDouble = (double) 10 / (double)3;
		System.out.println(resultDouble);
		
		//Increment & decrement
		int x = 1;
		int y = x++;
		System.out.println("y: "+ y);
		System.out.println("x :" + x);
		System.out.println("x++ :" + x++);
		System.out.println("x :" +x);
		
		//Augmented/ compound assignment operator
		x+=2;
		System.out.println("x :" + x);
		
	}

	private static void explainingConstants() {
		final float PI = 3.14F;
		
		System.out.println("Value of PI: "+ PI);
		
	}

	private static void explainingArrays() {
		System.out.println("\n===== explainingArrays=====");
		
		//Arrays
		int[] numbers = new int[5];
		numbers[0] = 9;
		numbers[1] = 4;
		numbers[2] = 0;
		numbers[3] = 3;
		
		int[] numbersSample = {9,1,6,4};
		
		
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		
		//Multi dimentional arrays
		System.out.println("Multi dimentional arrays");
		int[][] twoDNumbers = new int[3][3];
		twoDNumbers[0][0]= 1;
		twoDNumbers[0][1]= 1;
		twoDNumbers[0][2]= 1;
		twoDNumbers[1][0]= 1;
		twoDNumbers[1][1]= 1;
		twoDNumbers[1][2]= 1;
		twoDNumbers[2][0]= 1;
		twoDNumbers[2][1]= 1;
		twoDNumbers[2][2]= 1;
		System.out.println(Arrays.toString(twoDNumbers));
		System.out.println(Arrays.deepToString(twoDNumbers));
		
		int[][] twoDNumbersBraces = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.toString(twoDNumbersBraces));
		System.out.println(Arrays.deepToString(twoDNumbersBraces));
		
		System.out.println("\n===== Exit explainingArrays=====");
	}

	private static void explainingStrings() {
		System.out.println("\n===== explainingStrings=====");
		String  msg = "Sathya learns \"Java Basics\"";
		System.out.println(msg);
		
		
		System.out.println(msg.endsWith("Basics"));
		System.out.println(msg.indexOf("earn"));
		System.out.println(msg);
		System.out.println(msg.replace('a', 'o'));
		System.out.println(msg);
		
		String  filePath = "D:\\Career\\Projects\\workspaces\\eclipse-workspace1\\java-practice";
		System.out.println(filePath);
		//Original string is not changed . Strings are immutable. We cannot mutate/change them
		
//		Parameters are fields present in the method definition
//		Arguments are actual values passed to the methods
		
		
		//Any method that modifies a string will return a new string object
		System.out.println("\n===== \texplainingStrings Exit\t=====");
		
	}

	static void explainingTypes() {
		
		primitiveTypes();
		referenceTypes();
		primitiveVsReferenceType();
	}



	private static void referenceTypes() {
		//Reference types - for storing complex objects
		System.out.println("\n===== Reference types=====");
		Integer primIt = 5;
		Date joiningDate = new Date();
		System.out.println(joiningDate);
		
		//Reference types has members which can be accessed using  . DOT operator
		
		
		System.out.println("\n===== Reference types End=====");
	}

	private static void primitiveTypes() {
		System.out.println("\n===== Primitive types=====");
		int myAge = 30;
		int herAge = 28;
		long viewCount = 28_356_000_000L;
		double lowPrice = 10.99;
		float highPrice = 1000_000.99F;
		char letter = 's';
		boolean isDeveloper = true;
		
		
		//Primitive Types - for storing simple values
//		TYPE	BYTES	RANGE
//		byte	1		-128 to 127
//		short	2		-32k, 32k
//		int		4		-2B,2B
//		long	8		-
//		//decimals:
//		float	4
//		double	8
//		char	2		A,B,C, .BYTES..
//		boolean	1		true, false
		System.out.println("\n===== Primitive types End=====");
	}

	private static void primitiveVsReferenceType() {
		
		System.out.println("=====primitiveVsReferenceType=====");
		byte x = 1;
		byte y = x; 
		// y will not be affetced if value of x changes
		// x an y are completely independent
		//Primitive types are copied by their value
		
		Point point1 = new Point(1,1);// Assume point(1,1) is stored in address 100
		Point point2 = point1;
		System.out.println(point1);
		System.out.println(point2);
		//Point1 points to address of Point(1,1)
		//in Point1 memory location -stores address of point object i.e 100
//		point 1 and 2 are referencing the exact same object in the memory
		//Not independent, so changes will be impacted
		//Reference types are copied by their references
		
		System.out.println("=====primitiveVsReferenceType End=====");
	}
}
