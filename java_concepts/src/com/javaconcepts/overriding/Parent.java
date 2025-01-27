package com.javaconcepts.overriding;

public class Parent {

	private static void privateMethod()
	{
		System.out.println("Parent private method ....");
		
	}
	
	public  static void staticMethod()
	{
		System.out.println("Parent static  method ....");
		
	}
	
	public static void main (String arg[])
	{
		
		Parent.privateMethod();
			
		Parent.staticMethod();
		
	}
	
	
	
	
}
