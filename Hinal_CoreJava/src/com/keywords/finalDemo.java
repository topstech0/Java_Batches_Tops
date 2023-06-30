package com.keywords;

/*
 * final : it is a keyword.
 * 
 * - it is use to declare class,function and variable.
 * - when you declare a variable as final, then the value will not change throughout the program.
 * - when you declare the function as final, then you cannot override the function.
 * - when you declare the class as final, you cannot inherit the class.
 *  
 */

final class final1{
	
	 final int a = 20;
	
	final void show()
	{
		//a = 50;
		System.out.println(a);
	}
	
}


class final2 extends final1
{
	void show()
	{
		System.out.println(a);
	}
}



public class finalDemo {

	
	public static void main(String[] args) {
		
		final2 f1 = new final2();
		f1.show();
	}
}
