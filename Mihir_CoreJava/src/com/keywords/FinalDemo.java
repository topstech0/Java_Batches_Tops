package com.keywords;

/*
 * Keywords : Java provides 4 powerful keywords
 * 
 * 1) super
 * 2) final
 * 3) this
 * 4) static
 * 
 * final : it is a keyword
 * 
 * - final keyword can be declare to variable,function,class.
 * - if you declare the final keyword to variable, then you cannot change the value of the variable.
 * - if you declare the final keyword to function, then you cannot override the function.
 * - if you declare the final keyword to class, then you cannot inherit it.
 * 
 * 
 * 
 */


//final class final1
 class final1
{
	final float pi =3.14f;
	
	//final void show()
	 void show()
	{
		//pi = 54;
		System.out.println(pi);
	}
}
class final2 extends final1
{
	void show()
	{
		
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		
		final1 f1 = new final1();
		f1.show();
	}
}
