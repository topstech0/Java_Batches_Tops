package oop;

/*
 * Method Overiding:
 * 
 * - Same function name
 * - Same parameters
 * - Same return-type.
 * 
 * 
 */


class A2{
	
	A2()
	{
		System.out.println("A2's Constructor called.");
	}
	
	void show()
	{
		System.out.println("A2's Method Called.");
	}
}

class B2 extends A2{
	
	B2()
	{
		System.out.println("B2's Constructor called.");
	}
	
	void show()
	{
		super.show();
		System.out.println("B2's Method Called.");
	}
}

class C2 extends B2{
	
	C2()
	{
		System.out.println("C2's Constructor called.");
	}
	
	void show()
	{
		super.show();
		System.out.println("C2's Method Called.");
	}
}



public class MethodOveridingDemo {
	
	
	public static void main(String[] args) {
		
		C2 obj1 = new C2();
		obj1.show();
	}

}
