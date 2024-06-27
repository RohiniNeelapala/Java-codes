package com.basicprograms.arrays;

public class ArraysEqual {

	public static void main(String[] args)
	{
		int a[]=new int[] {10,20,30};
		int b[]=new int[] {10,30,30};
		int count=0;
		if(a.length==b.length)
		{
			for(int x=0;x<a.length;x++)
			{
				if(a[x]==b[x])
				{
					count++;
				}
			}
			if(count==a.length)
			{
				System.out.println("arrays are equal");
			}
			else
			{
				System.out.println("arrays are not equal");
			}
		}
		else
		{
			System.out.println("arrays are not equal");
		}

	}

}
