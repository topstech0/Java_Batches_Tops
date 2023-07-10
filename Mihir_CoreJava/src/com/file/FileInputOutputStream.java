package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * File:
 * 
 * FileInputStream : Read
 * FileOutputStream : WRite
 * 
 * 
 * 
 */

public class FileInputOutputStream {
	
	public static void main(String[] args) throws Exception {
		
		
			// Writing into the file.
			FileOutputStream fos  = new FileOutputStream("tops.txt"); //Create file
			String data = "This is Tops Technologies with FileInput"; 
			byte b[] = data.getBytes(); // it will store byte by byte in b.
			fos.write(b); // write into the file
			fos.close(); //file close
			System.out.println("Data is written in file.");
		
			//Reading into the file
			FileInputStream fis = new FileInputStream("tops.txt");
			int i=0;
			while((i=fis.read())!=-1)
			{				
				System.out.print((char)i);
			}
			
		
	}

}
