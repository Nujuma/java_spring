package com.javaconcepts.overriding;
//Subclass
class Derived extends Base {
  
 // This method is hidden by display() in Base 
 public static void display() {
      System.out.println("Static or class method from Derived");
 }
  
 // This method overrides print() in Base 
 public void print() {
      System.out.println("Non-static or Instance method from Derived");
}


//Driver class

 public static void main(String args[ ])  {
    Base obj1 = new Derived();
     
    // As per overriding rules this should call to class Derive's static 
    // overridden method. Since static method can not be overridden, it 
    // calls Base's display() 
    Base.display();  
     
    // Here overriding works and Derive's print() is called 
    obj1.print();     
 }

}
