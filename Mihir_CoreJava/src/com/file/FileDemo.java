package com.file;

import java.io.File;

public class FileDemo {
	
	public static void main(String[] args) {
		
		File fp = new File("tops1.txt");
		System.out.println(fp.canRead());
		System.out.println(fp.canWrite());
		System.out.println(fp.getAbsolutePath());
		System.out.println(fp.getFreeSpace());
		System.out.println(fp.isDirectory());
		System.out.println(fp.isFile());
		System.out.println(fp.isHidden());
		
	}

}
