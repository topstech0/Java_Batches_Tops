package com.collections;

import java.util.HashMap;

/*
 * HashMap : it belongs to the Map interface.
 * 
 * - HashMap works with Key and Value pair.
 * - Every Key is unique.
 * - No Duplicate Keys are allowed.
 * 
 * 
 */

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put(1, "Mihir");
		hm.put(2, "Hinal");
		hm.put(3, "Tinkesh");
		hm.put(4, "Nirav");
		hm.put(5, "Rakesh");
		hm.put(5, "Tops");
		hm.put(6, "Mihir");
		System.out.println(hm);
		
		System.out.println("HashMAp Size : "+hm.size());
		System.out.println("Get Data : "+hm.get(6));
		System.out.println("Remove Data : "+hm.remove(5));
		System.out.println(hm);
		
		hm.put(5, "Rakesh");
		System.out.println(hm);
		
		
	}
}
