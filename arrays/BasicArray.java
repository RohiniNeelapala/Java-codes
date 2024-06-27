package com.basicprograms.arrays;

public class BasicArray 
{

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		System.out.println(a.length);
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}

	}

}
