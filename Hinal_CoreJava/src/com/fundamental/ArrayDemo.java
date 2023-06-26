package com.fundamental;

import java.util.Scanner;

/*
 * Array : It is a name at memory location, to store more than one value of
 * 		   same types.
 * 
 *  	 - Index starts with 0.
 * 
 * syntax : 
 * 
 * 			data-type arrname[] = new int[size];
 * 
 */


public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many elements you want to store?");
		int size = sc.nextInt();
		
		int arr1[] = new int[size];		
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print("Enter Value for Index ["+i+"] : ");
			arr1[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("\nValue at Index ["+i+"] = "+arr1[i]);
		}
	}
	
}












