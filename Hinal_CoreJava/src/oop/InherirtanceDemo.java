package oop;

import java.util.Scanner;

/*
 * Inheritance : it is acquiring the properties of base-class into the derived class
 * 				 is called as Inheritance.
 * 
 * 				: In inheritance, objects are always created of derived class.
 * 
 *  Feature:   Reusability of a Code.
 *  
 *  Types of Inheritance.
 *  
 *  - There are 5 types of inheritance
 *  
 *  1) Single-level Inheritance
 *  2) Multi-level Inheritance
 *  3) Multiple-level Inheritance
 *  4) Hierarchical-level Inheritance
 *  5) Hybrid-level Inheritance
 *  
 *  Java only supports 3 types of inheritance
 *  
 *  1) Single-level Inheritance
 *  2) Multi-level Inheritance
 *  3) Hierarchical- level Inheritance
 *  
 *  
 *  Java doesn't support 
 *  
 *  1) Multiple-level Inheritance
 *  2) Hybrid-level Inheritance
 *  
 * 
 * 
 * 
 */

// Single-level Inheritance.
class A
{
	Scanner sc = new Scanner(System.in);
	int a;
	
	void getA()
	{
		System.out.println("Enter Value of A : ");
		a = sc.nextInt();
	}
	
	void showA()
	{
		System.out.println("Value of A : "+a);
	}
}

class B extends A{
	
	
	Scanner sc = new Scanner(System.in);
	int b;
	
	void getB()
	{
		System.out.println("Enter Value of B : ");
		b = sc.nextInt();
	}
	
	void showB()
	{
		System.out.println("Value of B : "+b);
	}
	
}


public class InherirtanceDemo {

	public static void main(String[] args) {
	
		B obj1 = new B();
		obj1.getA();
		obj1.getB();
		
		obj1.showA();
		obj1.showB();
	}	
}
