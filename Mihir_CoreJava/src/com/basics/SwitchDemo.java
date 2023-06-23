package com.basics;

import java.util.Scanner;

/*
 * switch(expression)
 * {
 * 		case value : statement;
 * 			 break;
 * 		case value : statement;
 * 			 break;
 * 		.
 * 		.
 * 		default : statement;
 * 			 break; 	
 * }
 * 
 * 
 * 
 * 
 */



public class SwitchDemo {
	
public static void main(String[] args) {
	
	int num1,num2;
	int choice;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("---------Choice Calculator-------");
	
	System.out.println("\n Enter +ve Value for Number1 : ");
	num1 = sc.nextInt();
	System.out.println("Enter +ve Value for Number2 : ");
	num2 = sc.nextInt();
	System.out.println("\nNumber1 : "+num1+", Number2 : "+num2);
	
	System.out.println("\n Press 1. for Addition\n Press 2. for Subtracion\n Press 3. for Multiplication\n Press 4. for Division");
	System.out.println("\nEnter your choice from the above Menu ? ");
	choice = sc.nextInt();
	
	switch(choice)
	{
	case 1 : System.out.println("Addition of Number1 and Number2 :"+(num1+num2));
		    break;
	case 2 : System.out.println("Subtraction of Number1 and Number2 :"+(num1-num2));
			break;
	case 3 : System.out.println("Multiplication of Number1 and Number2 :"+(num1*num2));
			break;
	case 4 : System.out.println("Division of Number1 and Number2 :"+((float)num1/num2));
			break;
	default : System.out.println("Invalid Choice");
			 
	
	}
	
}

}
