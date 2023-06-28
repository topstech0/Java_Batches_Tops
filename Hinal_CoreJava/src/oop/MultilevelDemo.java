package oop;

import java.util.Scanner;

class A1{

	Scanner sc = new Scanner(System.in);
	
	
	int a;
	
	void getA()
	{
		System.out.println("Enter A : ");
		a = sc.nextInt();
	}
	
	void showA()
	{
		System.out.println("A : "+a);		
	}
		
}

class B1 extends A1{
	
int b;
	
	void getB()
	{
		System.out.println("Enter B : ");
		b = sc.nextInt();
	}
	
	void showb()
	{
		System.out.println("B : "+b);		
	}
}

class C1 extends B1
{
	int c;
	
	void getC()
	{
		System.out.println("Enter C : ");
		c = sc.nextInt();
	}
	
	void showC()
	{
		System.out.println("C : "+c);
	}
	
}


public class MultilevelDemo {
	
	public static void main(String[] args) {
		
		C1 c = new C1();
		c.getA();
		c.getB();
		c.getC();
		
		c.showA();
		c.showb();
		c.showC();
		
	}

}
