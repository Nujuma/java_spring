package com.javaconcepts.files;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;


public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//List the files in the current directory
		

		//  System.out.println(" list files  in the root directory ");
		 
		// Files.list(Paths.get(".")).forEach(System.out::println);
		 
		 //Recursively  list and filter files in a folder
		 
		 
		  Path currentDirectory=Paths.get(".");
		  System.out.println("current path is--------------------"   +    currentDirectory );
		  
		  
		//  System.out.println("files in the current directory up to 4 levels ");
		 
		 //Files.walk(currentDirectory,4).forEach(System.out::println);
		 
		 
		//  System.out.println("files in the current directory up to 3 levels ");
		 
		// Files.walk(currentDirectory,3).forEach(System.out::println);
		
		 
		 //Filter files with only .java extension
		 
	
		 Predicate<? super Path> predicate = path ->String.valueOf(path).contains(".java");
		
		
		 System.out.println(" java files in the path" +  predicate);
		 
		// Files.walk(currentDirectory,4).filter(predicate)
		 
		 Files.walk(currentDirectory,4).filter(path ->String.valueOf(path).contains(".java"))
		                                .forEach(System.out::println);
		 
		 //Files find
		 
		// BiPredicate<Path ,BasicFileAttributes> javaMatcher =(path,attributes)->String.valueOf(path).contains(".java");
		 
		 
		 BiPredicate<Path ,BasicFileAttributes> DirectoryMatcher =(path,attributes)->attributes.isDirectory();
		 
		 System.out.println("Directories --------------------");
		 Files.find(currentDirectory,4, DirectoryMatcher).forEach(System.out::println);
		 //reed from a file
		 
		// Files.readAllLines().		 
		 


	}

}
