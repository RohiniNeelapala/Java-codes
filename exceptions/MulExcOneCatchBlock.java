package com.basicprograms.exceptions;

public class MulExcOneCatchBlock {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3};
		try
		{
			System.out.println(a[5]);
			System.out.println("i am try"+(10/0));
			
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("i am catch");
			System.out.println(ae);
		}

	}

}
