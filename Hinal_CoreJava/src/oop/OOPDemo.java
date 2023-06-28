package oop;

import java.util.Scanner;

/*
 * OOP : Object Oriented Programming
 * 
 *  - Java is OOP language.
 *  
 *  There are 4 important pillars in OOP.
 *  
 *  1) Encapsulation
 *  2) Inheritance
 *  3) Polymorphism
 *  4) Data Abstraction
 *  
 *  
 *  Encapsulation : It is wrapping up of a data into a single unit of class.
 *  				e.g capsule.
 *  
 *  Inheritance : It is acquiring the properties of base-class into the derived class , hence it is
 *  			  called as Inheritance.
 *  
 *  Polymorphism : poly-> many and morphism -> forms
 *  
 *   - it is a combination of Many forms.
 *   
 *   There are 2 types of Polymorphism.
 *   
 *   1) Compile-Time Polymorphism
 *   	
 *   	e.g Method Overloading
 *   
 *   2) Run-Time Polymorphism
 * 
 * 		e.g Method Overiding
 * 
 * 
 * 
 * Data Abstraction : It is hiding the internal implementation and providing the essential features
 * 					  is called as Data Abstraction.
 */


public class OOPDemo {

	Scanner sc = new Scanner(System.in);
	String name;
	int age;
	
	void getData()
	{
		System.out.println("Enter Name : ");
		name = sc.next();
		System.out.println("Enter Age : ");
		age = sc.nextInt();
	}
	
	void showData()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	
	
	public static void main(String[] args) {
	
		OOPDemo obj1 = new OOPDemo();
		obj1.getData();
		obj1.showData();
		
	}
	
}
