package com.oop;

import java.util.Scanner;

public class EncapsulationDemo {
	
	Scanner mihir = new Scanner(System.in); 
	//Data-Members or Variables
	int a,b;
	
	//Member-Functions or Method
	
	void getNumbers()
	{
		System.out.println("Enter A : ");
		a = mihir.nextInt();
		System.out.println("Enter B : ");
		b = mihir.nextInt();
	}
	
	void ArithmeticOperation()
	{
		System.out.println("Addition : "+(a+b));
		System.out.println("Subtraction : "+(a-b));
		System.out.println("Multiplication : "+(a*b));
		System.out.println("Division : "+((float)a/b));
	}
	
	public static void main(String[] args) {
		
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.getNumbers();
		ed.ArithmeticOperation();
	}
}
