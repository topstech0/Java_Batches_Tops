package com.fundamental;

import java.util.Scanner;

/*
 * Class : it is a collection of data-members and member-functions, which 
 * 			performs a specific task.
 * 
 * Object : it is an instance of a class.
 * 
 * Lifecycle of Object : 
 * 
 * 1) Creation
 * 2) Utilization
 * 3) Destruction
 * 
 * e.g Paper Cup
 * 
 */

public class ClassDemo {
	
	Scanner sc = new Scanner(System.in);
	
	// Data-Members
	String name; 
	int age;
	
	//Member-Functions	
	void getDetails()
	{
		System.out.print("Enter your Name : ");
		name = sc.next();
		System.out.print("Enter your Age : ");
		age = sc.nextInt();				
	}
		
	void showDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	
	
	public static void main(String[] args) {
		
		ClassDemo obj1 = new ClassDemo();
		obj1.getDetails();
		obj1.showDetails();
	}

}
