package com.javaconcepts.oops;

public class StringRunner {

	
	
	   
	
	
	public static void main (String arg[])
	{
		int N=99999;
		long t;
		
		String str= new String ("Hello.....");
		
		 str.concat("hi...");
		//StringBuffer buffer   = new StringBuffer("Hello");
		//            buffer.append ("Hi.....");
		//StringBuilder builder =new StringBuilder("Hello");
	//	      builder.append("Hi....");
		      
		//      System.out.println(str);
//
		  //    System.out.println(buffer);
//
	//	      System.out.println(builder);
		      
		t=System.currentTimeMillis();
		
		System.out.println("current time" + t );
		StringBuffer buffer   = new StringBuffer();
		
		for (int i=N;i-->0;)
		{
			buffer.append("");
			
		}
		
		  System.out.println(System.currentTimeMillis()-t);
		  
		  StringBuilder builder =new StringBuilder();
		  for (int i=N;i-->0;)
			{
				builder.append("");
				
			}
			
			  System.out.println(System.currentTimeMillis()-t);
			  
	}
}
