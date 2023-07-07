package com.oop;

/*
 * 
 * DataAbstraction : it is hiding the internal implementation and showing the essential features
 * 					 is called Data-Abstraction.
 * 
 * abstract-class : it provides partial abstraction.
 * 
 * - we cannot create an object of abstract class.
 * - Abstract class contains abstract-method as well as non-abstract method.
 * 
 * -Abstract Method.
 * 
 *  - abstract methods are those methods, which do not contain any body and they are just declared.
 *   
 *   e.g abstract void f1();  only declaration
 *   
 *  - Non-abstract method contain body
 *  
 *  e.g void hello()
 *  	{
 *  		//code
 *  	}
 * 
 *  - if you have declared the abstract method, then it is compulsory to implement that method in 
 *    child class.
 */

abstract class abs1
{
	abstract void hello();  //Abstract Method
	
	void display()
	{
		System.out.println("Non-Abstract Method from Abstract Class."); //Non-Abstract Method.
	}
}
class abs2 extends abs1
{

	
	void hello() {
		System.out.println("Abstract Method implemented in abs2");
		
	}

}



public class AbstractDemo {
	
	public static void main(String[] args) {
		abs2 a1 = new abs2();
		a1.display();
		a1.hello();
	}

}
