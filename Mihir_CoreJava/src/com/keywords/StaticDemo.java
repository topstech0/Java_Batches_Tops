package com.keywords;

import java.util.Scanner;

/*
 * static :  it is a keyword applied to variable,method;
 * 
 * - it is mainly used for common memory management
 * 
 */

public class StaticDemo {
	
	Scanner sc = new Scanner(System.in);
	static int a;
	
	void getA()
	{
		System.out.println("Enter A : ");
		a=sc.nextInt();
	}
	
	void showA()
	{
		System.out.println("A : "+a);
	}	
	
	public static void main(String[] args) {
	
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		StaticDemo s3 = new StaticDemo();
		s1.getA();
		s2.getA();
		s3.getA();
		
		
		s1.showA();
		s2.showA();
		s3.showA();
		
	}

}
