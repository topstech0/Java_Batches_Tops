package com.collections;

import java.util.Stack;

/*
 * Stack : it follows LIFO order.
 * 
 * LIFO (Last In First Out) 
 * 
 * e.g Plates arranged one after another.
 * 
 * - it stores multiple values of multiple types.
 */

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack st = new Stack();
		st.push(1);
		st.push(1.1f);
		st.push('e');
		st.push("Tops");
		st.push(1);
		st.push(true);
		st.push(null);
		System.out.println(st);
		
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.pop());
		
		
	}

}
