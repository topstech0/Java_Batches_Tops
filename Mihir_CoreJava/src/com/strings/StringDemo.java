package com.strings;

/*
 * String : In Java, String is a class  which is Immutable. (cannot be modified).
 * 			
 * 
 * 
 */

public class StringDemo {
	
	public static void main(String[] args) {
		
		String s1 = new String("This is Tops Technologies");
		
		System.out.println("Original String : "+s1);
		System.out.println("Length of String : "+s1.length());
		System.out.println("String in Uppercase : "+s1.toUpperCase());
		System.out.println("String in Lowercase : "+s1.toLowerCase());
		System.out.println("Sub-String : "+s1.substring(10));
		System.out.println("Sub-String : "+s1.substring(5, 16));
		
		String s2 = "Mihir";
		
		if(s1.equals(s2))
		{
			System.out.println("String 1 is equal to String 2.");
		}
		else
		{
			System.out.println("String 1 is not equal to String 2.");
		}
		
		
	}

}
