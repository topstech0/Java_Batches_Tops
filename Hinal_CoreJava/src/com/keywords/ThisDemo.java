package com.keywords;

/*
 * Java contains 3 powerful keywords.
 * 
 * 1) super
 * 2) this
 * 3) final
 * 4) static
 * 
 * 
 * -> this : it is a keyword, which refers to the current class.
 * 
 * 
 */

public class ThisDemo {
	
	String name;
	int age;
	
	ThisDemo(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void display()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
	
	public static void main(String[] args) {
		ThisDemo td = new ThisDemo("Hinal",23);
		td.display();
	}

}
