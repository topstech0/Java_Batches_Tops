package com.oop;

/*
 * interface : it provides Full Abstraction
 * 
 * - By default method inside interface are abstract.
 * 
 * - it is similar like a class, but it is not a class, because syntactically they are similar.
 * 
 * interface syntax :
 * 
 * interface interface-name
 * {
 * 
 * }
 * 
 * - if you have declared the abstract method, then it is compulsory to implement that method in 
 *    child class.
 * 
 * - To inherit interface with class, we make use of implements keyword.
 * =====================================
 * class-syntax:
 * 
 * class class-name
 * {
 * 
 * }
 * =====================
 * 
 * 
 * 
 */

interface ifs1
{
	public void welcome(); 
}

class tops implements ifs1 //To inherit interface with class, we make use of implements keyword.
{
	public void welcome()
	{
		System.out.println("Welcome Method implemented in Tops Class");
	}
}




public class InterfaceDemo {

	public static void main(String[] args) {
		tops t = new tops();
		t.welcome();
	}
}
