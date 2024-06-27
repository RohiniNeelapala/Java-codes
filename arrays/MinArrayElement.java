package com.basicprograms.arrays;

public class MinArrayElement 
{

	public static void main(String[] args)
	{
		int a[]=new int[] {1,5,6,7,8,9};
		int min=Integer.MAX_VALUE;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<min)
			{
				min=a[x];
			}
		}
		System.out.println(min);

	}

}
