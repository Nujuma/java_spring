package com.javaconcepts.oops;

public class FinallyRunner {
	@Override
	protected void finalize()
	{
		
		System.out.println (" the object is destroyed from memory");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallyRunner  obj =new FinallyRunner();
		    obj=null;
		    System.gc();
		  
	}

}
