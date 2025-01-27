package com.javaconcepts.oops;

public class StringEqualRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  str1=  new String ("Nujuma");
		String str2  =new String ("Nujuma");
		if  (str1.equals(str2))
		{
			System.out.println (" strings are equal.... created using new keyword");
			
		}
		else
		{

			System.out.println (" strings are not equal.... created using new keyword");
		}
			
	

	// TODO Auto-generated method stub

	if  (str1==str2)
	{
		System.out.println (" strings are equal .... created using new keyword and  == meethod");
		
	}
	else

		System.out.println (" strings are not equal.... created using new  keyword and == method");
	

}

}

