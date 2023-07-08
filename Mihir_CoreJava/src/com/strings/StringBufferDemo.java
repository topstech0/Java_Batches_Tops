package com.strings;

/*
 * StringBuffer : In Java StringBuffer is class, which is mutable. (can be modifyable)
 * 
 */

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This is StringBuffer Demo.");
		
		System.out.println("Original StringBuffer : "+sb);
		System.out.println("StringBuffer Length : "+sb.length());
		
		sb.insert(21, "from Tops");
		System.out.println("After inserting String : "+sb);
		
		sb.append(" in Mota Varachha");
		System.out.println("After Appending : "+sb);
		
		sb.delete(34, 43);
		System.out.println("After Deleting : "+sb);
		
	}

}
