package com.oop;

import java.util.Scanner;

class A
{
	Scanner sc = new Scanner(System.in);
	
	int a;
	
	void getA()
	{
		System.out.println("Enter A : ");
		a = sc.nextInt();
	}
	
	void showA()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b;
	
	void getB()
	{
		System.out.println("Enter B : ");
		b = sc.nextInt();
	}
	
	void showB()
	{
		System.out.println(b);
	}
	
}




public class SingleInheritanceDemo {
	
	public static void main(String[] args) {
		
		B ob = new B();
		ob.getA();
		ob.getB();
		ob.showA();
		ob.showB();
	}

}
