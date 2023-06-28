package com.oop;

import java.util.Scanner;

/*
 * OOP : It is a software Programming Model.
 * 
 * There are 4 important pillars of OOP.
 * 
 * 1) Encapsulation
 * 2) Inheritance
 * 3) Polymorphism
 * 4) Data Abstraction.
 * 
 * 
 * A) Encapsulation : It is wrapping up of a data into a single unit is called Encapsulation.
 * 
 * e.g capsule
 * 
 * B) Inheritance : It is acquiring the properties of Parent class into the Child class 
 * 					is called as Inheritance.
 * 
 * C) Polymorphism:  It is a combination of Many Forms.
 * 
 * 	 There are 2 types of Polymorphism
 * 
 *  1) Compile time Polymorphism
 *  
 *  	e.g Method Overloading
 *  
 *  2) Runtime Polymorphism
 * 
 * 		e.g Method Overiding
 * 
 * D) Data Abstraction : It is hiding the internal implementation and showing the essential features.
 * 
 *  
 *  
 *  Class: It is a collection of Data-Members and Member-Functions
 *  
 *  Object : It is an instance of a class.
 *  
 *  lifecycle of an object:
 *  
 *  1) Creation
 *  2) Utilization
 *  3) Destruction
 *  
 *  e.g papercup.
 *  
 *  Object Creation :
 *  
 *  class-name obj-name = new class-name();
 *  
 * 
 * 
 */

public class OOPDemo {
	
	
	
	Scanner sc = new Scanner(System.in);
	//Data-Members
	String name;
	int age;
	
	//Member Functions
	void getDetails()
	{
		System.out.println("Enter Name : ");
		name = sc.next();
		System.out.println("Enter Age : ");
		age = sc.nextInt();
	}	
	
	void showDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	
	
	
	public static void main(String[] args) {
		
		OOPDemo obj1 = new OOPDemo();
		obj1.getDetails();
		obj1.showDetails();
		
	}

}
