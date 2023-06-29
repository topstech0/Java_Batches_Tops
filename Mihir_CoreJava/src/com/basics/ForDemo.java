package com.basics;

import java.util.Scanner;

/*
 * Nested Loop:
 * 
 * syntax : 	for(initialization;condition;updation)
 * 				{
 * 					for(initialization;condition;updation)
 * 					{
 * 						//statement;
 * 					}
 * 				}
 * 
 * 
 * outerloop : row
 * innerloop : col
 * 
 *  - innerloop will execute until the outerloop condition will become false.
 *  - innerloop is dependent on outerloop.
 */




public class ForDemo {
	
	public static void main(String[] args) {
		
		/* Multiplication Table.
		int n;
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter No.");
		n = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" X "+i+" = "+(n*i));
		}
		*/
		
		//Nested Loop : Pattern1
		
		
		for(int i =1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		//Pattern 2
		
		/*
		for(int i =1;i<=10;i++)
		{
			
			for(int sp=1;sp<=10-i;sp++)
			{
				System.out.print(" ");
			}
			
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		//Pattern 3
		for(int i =1;i<=10;i++)
		{
			
			for(int sp=1;sp<=10-i;sp++)
			{
				System.out.print(" ");
			}
			
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		*/
		
	}
	

}
