package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exception : it is an abnormal situation, that arises during the runtime of the program.
 * 				is called exception.
 * 
 * 			 : it will stop the line at that point, where the exception is raised.
 * 
 * 				e.g  if there are 100 lines of code, and if the exception is raised at the line 12
 * 					 then it will not go to next line i.e line 13. and therefore it will terminate the
 * 					program there.
 * 
 * =========================================================================================
 * 
 * There are 2 types of Exception.
 * 
 * 1) Checked Exception:
 * 
 * 	- it will execute at Compile Time.
 * 
 * 2) Unchecked Exception:
 * 
 * - it will execute at Run Time.
 * 
 * =========================================================================================
 * 
 * To handle exception, there are 5 keywords
 * 
 * 1) try
 * 2) catch
 * 3) throw
 * 4) throws
 * 5) finally
 * 
 * ==========================================================================================
 * 
 * 1) try block: it is a block of code.
 * 			 - try block will never be alone, it will have atleast one catch block or finally block 
 * 				is compulsory.
 * 			- try block is to generate the exception
 * 			- try block can have multiple catch block.
 * 
 * 			syntax: try 
 * 					{
 * 						//code
 * 					}
 * 
 * 
 * 2) catch block : - it will execute this block, when the exception is generated.
 * 					- it is use to handle the exception, that is raised by the try block.
 * 
 * 			syntax : catch(ExceptionName objname)
 * 					 {
 * 						//code
 * 					 }
 * 
 * 3) finally block : it will execute the block even if the exception is generated or not.
 * 			
 * 			syntax : finally()
 * 					 {
 * 						//code
 * 					 }
 * 
 * 
 * 
 * 
 * 
 */

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println("Start Code.");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter A  : ");
			int a = sc.nextInt();
			System.out.println("Enter B : ");
			int b = sc.nextInt();
			int c =a/b;
			System.out.println("Division : "+c);
			int arr[]= {2,3,5};
			System.out.println(arr[2]);
		}
		/*
		catch(ArithmeticException ae)
		{
			System.out.println("Exception Caught.");
		}
		catch(InputMismatchException ie)
		{
			System.out.println("Exception Caught.");
		}
		catch(ArrayIndexOutOfBoundsException ao)
		{
			System.out.println("Exception Caught.");
		}
		*/
		catch(Exception e)
		{
			System.out.println("Exception caught.");
		}
		finally
		{
			System.out.println("Finally block executed.");
		}
	}

}
