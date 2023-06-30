package oop;

/*
 * Polymorpshim : 
 * 
 * - Poly -> Many and morphism -> forms
 * - it is a combination of many forms.
 * 
 * There are 2 types of Polymorphism:
 * 
 * 1) Compile -Time Polymorphism
 * 
 * 		e.g method overloading
 * 
 * 2) Run - Time Polymorphism
 * 
 * 		e.g method overiding
 * 
 * =====================================================
 * 
 * Method Overloading : 
 * 
 *  - Same function name
 *  - Different parameters
 *  - Different return-type
 * 
 * 
 * 
 */


class MethodOverloading
{
	void add()
	{
		int a=10,b=32;
		System.out.println("Addition : "+(a+b));		
	}
	
	void add(int a, int b)
	{		
		System.out.println("Addition : "+(a+b));		
	}
	
	float add(float a, float b)
	{
		return a+b;
	}
}


public class PolymorpshimDemo {
	
	public static void main(String[] args) {
				
		MethodOverloading mo = new MethodOverloading();
		mo.add();
		mo.add(54, 47);
		float sum = mo.add(14.14f,74.3f);
		System.out.println("Addition : "+sum);
	}

}
