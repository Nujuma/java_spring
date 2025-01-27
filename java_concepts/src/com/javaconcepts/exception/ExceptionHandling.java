package com.javaconcepts.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//checked exception  - occurs at the time of compilation ,try catch or throws
		
		 try
		 {
			 int b=0;
			 
			if (b>0) 
			 {
				 int a=10; b=0;
				var  c=a/b;
				 System.out.println(c) ;
									 
			 }
			 
		 }catch (Exception e)
		 {
			 e.printStackTrace();
		 }
		  
		 
		// System.out.println("sucessful");
		 
			 
		
		//System.out.println(5/0)
		
		//int a [] = {1,2,3,4,5};
		
		//System.out.println(a[6]);
	/*	
				
	try {
		FileReader file =new FileReader("sample.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	*/
		
		
	}

}
