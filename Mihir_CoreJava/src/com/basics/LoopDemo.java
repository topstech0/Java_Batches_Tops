package com.basics;

/*
 * Loop :  it is a process,where the task gets repeated again and again.
 * 
 * 3 important facts in Loop.
 * 
 * 1) Initialization
 * 2) Conditional
 * 3) Updation
 * 
 * 
 * 
 * There are 3 Loops in Java.
 * 
 * 1) while loop
 * 
 * syntax :  Initialization
 * 
 * 			 while(condition)
 * 			 {
 * 				statement;
 * 				updation
 * 			 }
 * 
 *  - it is called as Entry Controlled Loop.
 *  - Because the condition is checked first and then the statement is executed.
 *  - No semicolon after condition.
 * 	
 * 
 * 
 * 2) do..while loop
 * 
 * 		syntax:
 * 					initialization
 * 
 * 					do
 * 					{
 * 						//statement;
 * 					}
 * 					while(condition);
 * 
 * - it is also called as Exit Controlled Loop.
 * - Because the body is executed first and then the condition is checked.
 * - it will execute atleast once even if the condition is false.
 * - semi-colon after condition.
 * 
 * 3) for loop : All in one line.
 * 
 * - syntax: 
 * 
 * 			for(initialization;condition;updation)
 * 			{
 * 				//statement;
 * 			}
 * 
 */

public class LoopDemo {

	public static void main(String[] args) {
		
		//int i=1; // Initialization
		
		/*
		while(i<=100)// Condition
		{
			System.out.println(i+".Mihir");
			i++; // i = i+1  - it will add the value by 1;
		}
		*/
		
		/*
		int i = 100;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
		*/
		
		/*
		int i=1; // initialization
		
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<=100);
		*/
		
		for(int i=2;i<=100;i=i+2)   // i = i+2 //Oddno
		{
			System.out.println(i);
		}
		
		
		
	}
	
}
