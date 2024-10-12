package com.codewithsathya.basics;

import java.awt.*;
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
			//Control flows
			
			//package the application
		
//		2. OOPS
		
//		3. Core Java APIs
		
//		4. Advanced Features
		
		
	}
	
	private static void explainingStrings() {
		System.out.println("\n===== explainingStrings=====");
		String  msg = "Sathya learns Java Basics";
		System.out.println(msg);
		
		
		System.out.println(msg.endsWith("Basics"));
		System.out.println(msg.indexOf("earn"));
		System.out.println(msg);
		System.out.println(msg.replace('a', 'o'));
		System.out.println(msg);
		//Original string is not changed . Strings are immutable. We cannot mutate/change them
		
//		Parameters are fields present in the method definition
//		Arguments are actual values passed to the methods
		
		System.out.println("\n===== explainingStrings Exit=====");
		
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
