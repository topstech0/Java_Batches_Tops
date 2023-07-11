package com.collections;

import java.util.ArrayList;

/*
 * Collection : it is a group of Data.
 * 
 * In C language, we have Structure and 
 * 
 * In Java language, we have Collection
 * 
 *  
 *   ArrayList : 
 *   
 *   - it is similar like an Array, but it stores multiple values of multiple types.
 *   - Index value starts from 0.
 *   - Duplicate values are allowed.
 *   - Insertion order is maintained.
 *   
 * 	 Array :
 * 
 * 	 - it stores multiple values , but of same type.
 * 
 */


public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(1.1f);
		list.add(false);
		list.add('r');
		list.add("tops$");
		list.add(null);
		list.add(true);
		list.add(0);
		list.add(1);
		System.out.println(list);
	}
}
