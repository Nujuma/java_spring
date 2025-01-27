package com.javaconcepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class StreamsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list =Arrays.asList(5,10,15,20);
	 int lsum=	list.stream().mapToInt(Integer::intValue).sum();
	 System.out.println(lsum);
	 
		list.stream().mapToInt(Integer::intValue).sum();
		 System.out.println(lsum);
		 

	}

}
