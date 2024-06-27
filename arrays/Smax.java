package com.basicprograms.arrays;

import java.util.Arrays;

public class Smax
{

	public static void main(String[] args)
	{
		int a[]=new int[] {10,4,20,1,9,8,40};
		int max=Integer.MIN_VALUE;
		int Smax=Integer.MIN_VALUE;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>max)
			{
				Smax=max;
				max=a[x];
				
			}
			else if(a[x]<max&& a[x]>Smax)
			{
				Smax=a[x];
			}
		}
		System.out.println(Smax);

	}

}
