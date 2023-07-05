package com.oop;

/*Polymorphism : It is a combination of many forms.
 * 
 * There are 2 types of Polymorphism
 * 
 * 1) Compile-Time Polymorphism
 * 
 * 		e.g Method Overloading
 *
 * 2) Run - Time Polymorphism
 * 
 * 		e.g Method Overiding 
 * 
 *
 * Method Overloading : 
 * 
 * - Same Method Name
 * - Different Return type
 * - Different Parameters.
 * 
 * 
 * Function/Method syntax : 
 * 
 * return-type/datatype  function-name()
 * {
 * 		//code
 * }
 * 
 * 
 * 
 */

class MODemo
{
	void common()
	{
		int a=10,b=30;
		System.out.println("Add : "+(a+b));
	}
	
	void common(int x,int z)
	{
		System.out.println("Multiplication : "+(x*z));
	}
	
	int common(int num)
	{		
		return num*num;
	}
	
	
	
}


public class PolymorphismDemo {
	
	public static void main(String[] args) {
		MODemo md = new MODemo();
		md.common();
		md.common(3, 5);
		System.out.println("Square : "+md.common(6));
	}

}
