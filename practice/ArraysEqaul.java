package com.basicprograms.practice;

import java.util.Arrays;

public class ArraysEqaul {

	public static void main(String[] args)
	{
		int a[]= {10,20,30,40};
		int b[]= {10,20,30,4};
		if(Arrays.equals(a, b))
		{
			System.out.println("arrays are equal");
		}
		else
		{
			System.out.println("arrays are not equal");
		}
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
