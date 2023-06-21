package com.basics;

import java.util.Scanner;

// Single line comment
/*
 *  Multi-line comment
 */

/*
 * Datatypes:
 * 
 * Data Type	Default Value	Default size
	boolean			false			1 bit
	char		'\u0000'			2 byte
	byte			0				1 byte
	short			0				2 byte
	int				0				4 byte
	long			0L				8 byte
	float			0.0f			4 byte
	double			0.0d			8 byte
 * 
 * 
 * Variables :
 * 
 * it is a name at memory location, which stores the value of different type.
 * 
 * syntax: data-type variable-name
 * 
 * e.g int a;
 * 
 * Rules for declaring the Variable name.
 * 
 * 1) First character should not be a digit.
 * 
 * illegal : 1a;  legal : a1;
 * 
 * 2) No special character allowed except _
 * 
 * illegal : @a,a@   legal: a_,_a
 * 
 * 3) Variable name should be meaningful;
 * 
 * 4) Variable are case-sensitive.
 * 
 * a is different from A.
 * 
 *
 * To Print we make use of:
 * 
 * System.out.println();
 * 
 * ==============================
 * 
 * To take input we make use of:
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 */


public class Test1 {

	public static void main(String[] args) {
		
		/*
		int num1 = 10;
		int num2 = 20;
		System.out.println("----Simple Calculator----\n\n");
		System.out.println("Addition : "+(num1+num2));
		System.out.println("Subtraction : "+(num1-num2));
		System.out.println("Multiplication : "+(num1*num2));
		System.out.println("Division : "+((float)num1/num2));
		
		*/
		int a,b;
		
		Scanner sc = new Scanner(System.in); // To take input from the user.
		
		System.out.println("Enter the Value of A : ");
		a = sc.nextInt();
		System.out.println("Enter the Value of B : ");
		b = sc.nextInt();
		System.out.println("----Simple Calculator----\n\n");
		System.out.println("Addition : "+(a+b));
		System.out.println("Subtraction : "+(a-b));
		System.out.println("Multiplication : "+(a*b));
		System.out.println("Division : "+((float)a/b));
		
		
	}
}
