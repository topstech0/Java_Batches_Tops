package com.basics;

import java.util.Scanner;

/*
 * Array : - it is a name at memory location, to store multiple values of same type.
 * 		   - Array index starts with 0.	
 * 		
 * 
 * syntax : 
 * 
 * 			data-type array-name[] = new data-type[size];
 * 
 * 	e.g 
 * 			int marks[] = new int[5]; //Array Declartion
 * 
 * 
 * 
 * 
 */

public class ArrayDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int marks[] = new int[5];

		for (int i = 0; i < marks.length; i++) {
			System.out.print("Enter Subject " + (i + 1) + " : ");
			marks[i] = sc.nextInt();
		}

		for (int i = 0; i < marks.length; i++) {
			System.out.println("Subject " + (i + 1) + " Marks is : " + marks[i]);

		}

		// Ascending Order
		for (int i = 0; i < marks.length; i++) {

			for (int j = i + 1; j < marks.length; j++) {
				if (marks[i] > marks[j]) {
					int t = marks[i];
					marks[i] = marks[j];
					marks[j] = t;
				}
			}

		}

		System.out.println("\nMarks arranged from Smallest to Biggest No.");
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Subject " + (i + 1) + " Marks is : " + marks[i]);
		}

		// Descending Order
		for (int i = 0; i < marks.length; i++) {

			for (int j = i + 1; j < marks.length; j++) {
				if (marks[i] < marks[j]) {
					int t = marks[i];
					marks[i] = marks[j];
					marks[j] = t;
				}
			}

		}

		System.out.println("\nMarks arranged from Biggest No. to Smallest No.");
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Subject " + (i + 1) + " Marks is : " + marks[i]);
		}

	}

}
