package com.multithreading;

/*
 * Thread : it is a smallest unit of a program is called as Thread.
 * 
 * 			In Java, there we have an inbuilt Thread class.
 * 
 * By default Java provides 3 default values.
 * 
 * 1) Thread Name : main
 * 2) Thread Priority : 5
 * 3) Group Name : main
 * 
 * 
 * 2nd Argument we have 3 parameters:
 * 
 * 1st MIN_PRIORITY where value is : 1
 * 2nd NORM_PRIORITY where value is : 5
 * 3rd MAX_PRIORITY where value is : 10
 * 
 * 3rd Argument we have group name: where it is the default name.
 * 
 */

public class ThreadDemo {

	public static void main(String[] args) throws Exception {
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		t.setName("TopsThread");
		System.out.println("\nAfter Changing Name : "+t);
		
		t.setPriority(7);
		System.out.println("\nAfter Changing Thread Priority : "+t);
		
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(2000);
			System.out.println(t+" : "+i);
		}
		
		
		
	}
	
}
