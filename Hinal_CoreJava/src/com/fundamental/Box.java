package com.fundamental;

/*
 * Constructor :  It is a special member function
 * 
 * - the constructor name is same as the class-name
 * - no return-type 
 * - it is use to initialize the value to the members of the class.
 * 
 * important : 
 * 
 * - when the object is created, the constructor is called automatically.
 * 
 * Types of Constructor:
 * 
 * 1) Default Constructor
 * 
 * 	syntax :  
 * 				class-name()
 * 				{
 * 					//statement
 * 				}
 * 
 * 
 * 2) Parameterized Constructor
 * 
 * syntax : 
 * 
 * 				class-name(par1,para2,...)
 * 				{
 * 					//statement
 * 				}
 * 
 */

public class Box {
	
	int width,breadth,depth;
	
	//Default Constructor
	Box()
	{
		System.out.println("Default Constructor Called.");
		width = 5;
		breadth = 4;
		depth = 3;
	}
	
	Box(int w,int b,int d)
	{
		System.out.println("Parameterized Constructor Called.");
		width = w;
		breadth = b;
		depth = d;
	}
	
	//Method
	void volume()
	{
		System.out.println("Volume of Box : "+(width*breadth*depth));
	}
		

	public static void main(String[] args) {
	
		Box b1 = new Box(); //Default Constructor
		b1.volume();
		Box b2 = new Box(5,8,6); //Parameterized Constructor
		b2.volume();
		
	}
}
