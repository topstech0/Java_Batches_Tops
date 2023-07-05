package com.oop;

/*
 * Method Overiding:
 * 
 * - Same Method Name
 * - Same Parameters
 * - Same Return type.
 * 
 * Keywords:
 * 
 * - super : it is keyword, where you can call the super class method.
 * 
 */

class X
{
	void dikhao()
	{		
		System.out.println("Ye hai X ka Dikhao Method.");
	}
}

class Y extends X
{
	void dikhao()
	{
		super.dikhao();
		System.out.println("Ye hai Y ka Dikhao Method.");
	}
}
class Z extends Y
{
	void dikhao()
	{
		super.dikhao();
		System.out.println("Ye hai Z ka Dikhao Method.");
	}
}



public class MethodOveridingDemo {
	
	public static void main(String[] args) {
		
		Z z = new Z();
		z.dikhao();
	}

}
