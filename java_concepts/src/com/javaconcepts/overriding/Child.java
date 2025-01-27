package com.javaconcepts.overriding;

public class Child extends Parent
{
	
	private static void privateMethod()
	{
		System.out.println("child private method ....");
		
	}
	
	

	
	public  static void staticMethod()
	{
		System.out.println("child  static  method ....");
		
	}
	// static methods and tied with class not with the instance of the class
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		Child.staticMethod();
		Child.privateMethod();
		Parent.staticMethod();
				

	}

}
