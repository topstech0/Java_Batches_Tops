package com.collections;

import java.util.HashSet;

/*
 * HashSet: it belongs to the Set interface. 
 * 
 * it stores multiple value of multiple types.
 * 
 * -> it does not store Duplicate values.
 * -> Insertion order is not maintained.
 * 
 * 
 */


public class HashSetDemo {
	
	public static void main(String[] args) {
		String str=null;
		HashSet hs =new HashSet();
		hs.add(1);
		hs.add(1.1f);
		hs.add('t');
		hs.add("tops");
		hs.add(str);
		hs.add(true);
		hs.add(1);
		System.out.println(hs);
		
	}

}
