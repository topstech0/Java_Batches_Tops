package com.basics;

import java.util.Scanner;

/*
 * Ladder if/else : 
 * 
 * if(condition)
 * {
 * 		statement
 * }
 * else if(condition)
 * {
 * 		statement
 * }
 * else if(condition)
 * {
 * 		statement
 * }
 * else
 * {
 * 		statement
 * }
 * 
 * 
 * 
 * 
 * 
 */



public class LadderIfelse {
	
	public static void main(String[] args) {
		
		String name;
		int rollno,total,physics,chemistry,maths;
		float percentage;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		name = sc.next();
		System.out.println("Enter Roll No : ");
		rollno=sc.nextInt();
		System.out.println("Enter Physics Marks : ");
		physics = sc.nextInt();
		System.out.println("Enter Chemistry Marks : ");
		chemistry = sc.nextInt();
		System.out.println("Enter Maths Marks : ");
		maths = sc.nextInt();
		total = (physics+chemistry+maths);
		percentage = ((float)total/3);
		System.out.println("Total Marks : "+total);		
		System.out.println("Percentage : "+percentage);
		
		if(percentage>=75)
		{
			System.out.println("Distinction");
		}
		else if(percentage >=60)
		{
			System.out.println("First Class");
		}
		else if(percentage >=50)
		{
			System.out.println("Second Class");
		}
		else if(percentage >=40)
		{
			System.out.println("Pass Class");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
		
	}

}
