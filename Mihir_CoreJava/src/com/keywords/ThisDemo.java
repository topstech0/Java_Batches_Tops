package com.keywords;

/*
 * this -> it is a keyword.
 * 
 * - it is use for referring the current class.
 * 
 * 
 */

public class ThisDemo {
	
	String name="Rakesh";
	int age =31;
	
	void getDetails(String name,int age)
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+this.age);
	}
	
	
	
	public static void main(String[] args) {
		ThisDemo td = new ThisDemo();
		td.getDetails("Mihir", 30);
	}

}
