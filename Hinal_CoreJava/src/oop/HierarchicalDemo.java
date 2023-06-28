package oop;

class Side{
	
	int l;
	
	void getVal(int len)
	{
		l = len;
	}
}

class Square extends Side 
{
	int sq()
	{
		return l*l;
	}
}

class Cube extends Side
{
	int cu()
	{
		return l*l*l;
	}
}




public class HierarchicalDemo {

	public static void main(String[] args) {
		
		Square s = new Square();
		s.getVal(5);
		System.out.println("Square : "+s.sq());
		
		Cube c = new Cube();
		c.getVal(7);
		System.out.println("Cube : "+c.cu());
		
	}
}
