package com.javaconcepts.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String eName;

	int age;
	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", age=" + age + "]";
	}


	public Employee(String eName, int age) {
		super();
		this.eName = eName;
		this.age = age;
	}
	
	public static void printdata(Employee object1)
    {

        System.out.println(object1.eName);
        System.out.println( object1.age);
       
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee object = new Employee("Nujuma",47)
				;
        String filename =("C:\\Spring\\read-write-excel\\src\\main\\resources\\Employee.txt");
		

        // Serialization
        try {

            // Saving of object in a file
            FileOutputStream file = new FileOutputStream
                                           (filename);
            ObjectOutputStream out = new ObjectOutputStream
                                           (file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
            System.out.println(object.geteName());

            System.out.println(object.getAge());
            
            
        } catch (Exception e)
        
        {
         e.printStackTrace();
		}
        
    //deserialization        
	try {

        // Reading the object from a file
        FileInputStream file = new FileInputStream
                                     (filename);
        ObjectInputStream in = new ObjectInputStream
                                     (file);

        // Method for deserialization of object
        object = (Employee)in.readObject();

        in.close();
        file.close();
        System.out.print("Object has been deserialized");
       printdata(object);
     //  System.out.println(object.geteName());

     //  System.out.println(object.getAge());
       
       
} catch (Exception e)

{
 e.printStackTrace();
}

}}
