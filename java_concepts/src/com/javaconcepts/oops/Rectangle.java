package com.javaconcepts.oops;



public class Rectangle implements Shape
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println(" I am going to draw  a rectangle");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
		System.out.println(" I am going to calculate the area of  a rectangle");
	}
	

	public static void main(String[] args) 
	{
		  Shape shape = new Rectangle();

		  Shape shape1 = new Circle();
		     
		     shape.draw();
		     shape.area();
		     
		     shape1.draw();
		     shape1.area();
	}               
		// TODO Auto-generated method stub
}
