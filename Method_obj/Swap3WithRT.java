package com.basicprograms.Method_obj;

public class Swap3WithRT 
{
    
	public static void main(String[] args)
	{
		Swap3WithRT obj=new Swap3WithRT();
		System.out.println(obj.Swap());

	}
	int Swap()
	{
		int a=20,b=10,c=0;
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping");
		return a;
		
		
	}

}
