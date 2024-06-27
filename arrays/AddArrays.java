package com.basicprograms.arrays;

public class AddArrays 
{

	public static void main(String[] args)
	{
		int a[]=new int[] {10,20,30};
		int b[]=new int[] {40,50,60};
		int c[]=new int[a.length+b.length];
		
		for(int x=0;x<a.length;x++)//0//1   1//2   2//3    3
		{
			c[x]=a[x];//c[0]=a[0]=10//c[1]=a[1]=20//c[2]=30
			
		}
		int temp=a.length;
		for(int x=0;x<b.length;x++,temp++)//x=0   3 a.length//1    4//2    5//3    6
		{
			c[temp]=b[x];//c[3]=b[0]=40//c[4]=50//c[5]=60
			
		}

	
		for(int x=0;x<c.length;x++)
		{
			System.out.print(c[x]+"   ");
		}
	}

}
