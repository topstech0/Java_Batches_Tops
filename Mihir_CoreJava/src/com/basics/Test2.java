package com.basics;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		/*String name="Mihir";
		String email="mihir@gmail.com";
		String address = "Surat";		
		int age = 30;
		*/
		
		String name,email,address;
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name : ");
		name = sc.next();
		System.out.println("Enter your email : ");
		email = sc.next();
		System.out.println("Enter your Address : ");
		address = sc.next();		
		System.out.println("Enter your Age : ");
		age = sc.nextInt();
		
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("Address : "+address);
		System.out.println("Age : "+age);
		
		
	}
}
