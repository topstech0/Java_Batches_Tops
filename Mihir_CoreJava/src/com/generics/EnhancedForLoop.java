package com.generics;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * EnhancedForLoop : foreach loop.
 * 
 * Generics : it is like a medicine.
 * 
 * - the main aim is to provide the Type-Safety and Common Data-Type.
 * 
 * In Java, it provides with <E>
 * 
 * <E> :  it is a predefined Generic class.
 * 
 * <> : within angular brackets, you can only pass Reference Types i.e Class,Enum,Structure,etc.
 * 
 * 		: you cannot pass any primitive data types in <> brackets.
 * 
 * 	primitive data-types are : int,float,etc...
 * 
 * 
 * EnhancedForLoop : foreach loop.
 * 
 * -  it is use to iterate the elements.
 *
 * syntax : 
 * 
 * 			for(Class-Name objectname : Name)
 * 			{
 * 				//code
 * 			}
 * 
 * 
 */

public class EnhancedForLoop {

	public static <E> void printArray(E[] inputArray)
	{
		for(E e :  inputArray)
		{
			System.out.print(e+",");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		
		Integer intArray[]= {10,20,30,40,50};
		Float floatArray[]= {1.1f,2.2f,3.3f,4.4f,5.5f};
		Character charArray[]= {'t','o','p','s'};
		
		
		
		printArray(intArray);
		printArray(floatArray);
		printArray(charArray);
		
		
	}
}
