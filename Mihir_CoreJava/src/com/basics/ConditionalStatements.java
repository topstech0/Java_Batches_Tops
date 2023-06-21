package com.basics;

import java.util.Scanner;

/*
 * Conditional Statements : 
 * 
 * A) 
 * 1) Simple if
 * 
 * syntax:	if(condition)
 * 			{
 * 				statements.
 * 			} 
 * 
 * -> condition evaluates to a boolean value; i.e True/False
 * -> if the condition is true, then the if block is executed.
 * -> if the condition is false, then the else block is executed.
 * 
 * 2) if/else
 * 
 * syntax:	if(condition)
 * 			{
 * 				statements;
 * 			}
 * 			else
 * 			{
 * 				statements;
 * 			}
 * 
 * 
 * 3) nested if/else:
 * 
 * syntax : 
 * 
 * 			if(condition)
 * 			{
 * 				if(condition)
 * 				{
 * 					statement
 * 				}
 * 				else
 * 				{
 * 					statement
 * 				}	
 * 			}
 * 			else
 * 			{
 * 				if(condition)
 * 				{
 * 					statement
 * 				}
 * 				else
 * 				{
 * 					statement
 * 				}
 * 					
 * 			}
 * 
 * 
 * 
 * 4) ladder if/else
 * 
 * B) Switch statements.
 * 
 * 1) switch
 * 
 * 
 */

public class ConditionalStatements {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * 
		int val;		
		System.out.println("Enter the Value.");
		val = sc.nextInt();
		
		
		if(val>0)
		{
			System.out.println("It is a +ve No.");
		}
		else
		{
			System.out.println("It is a -ve No.");
		}
		*/
		
		/*
		int n1,n2;
		System.out.println("Enter the Value of N1.");
		n1= sc.nextInt();
		System.out.println("Enter the Value of N2.");
		n2 = sc.nextInt();
		System.out.println("Number 1 : "+n1);
		System.out.println("Number 2 : "+n2);
		//System.out.println("Number1 = "+n1+" Number2 = "+n2);
		
		if(n1>n2)
		{
			System.out.println("Number 1 is Greater");
		}
		else
		{
			System.out.println("Number 2 is Greater");
		}
		*/
		
		int n1,n2,n3;
		System.out.println("Enter the Value of Number1.");
		n1= sc.nextInt();
		System.out.println("Enter the Value of Number2.");
		n2 = sc.nextInt();
		System.out.println("Enter the Value of Number3.");
		n3 = sc.nextInt();
		//System.out.println("Number 1 : "+n1);
		//System.out.println("Number 2 : "+n2);
		System.out.println("Number1 = "+n1+", Number2 = "+n2+", Number3 = "+n3);
		
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println("Number 1 is Greater");
			}
			else
			{
				System.out.println("Number 3 is Greater");
			}			
		}
		else
		{
			if(n2>n3)
			{
				System.out.println("Number 2 is Greater");
			}
			else
			{
				System.out.println("Number 3 is Greater");
			}	
		}
		
		
		
	}

}
