package com.oop;


class Side
{
	int length;
	
	void getLength(int l)
	{
		length = l;
	}	
}

class Square extends Side
{
	int sqr()
	{
		return length*length;
	}
}

class Cube extends Side
{
	int cu()
	{
		return length*length*length;
	}
}

public class HierarchicalInheritanceDemo {
	
	public static void main(String[] args) {
		
		Square sq = new Square();
		sq.getLength(5);
		System.out.println("Square of Length :"+sq.sqr());
		
		Cube Cu = new Cube();
		Cu.getLength(9);
		System.out.println("cube of length: " +Cu.cu());
	}
	
}
	
	
	


