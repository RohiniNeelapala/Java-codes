package com.basicprograms.arrays;

import java.util.Arrays;

public class SecondLargeEle 
{

	public static void main(String[] args)
	{
		int a[]=new int[] {12,1,3,23,56,70,78};
		Arrays.sort(a);
		int max=a[a.length-1],smax=0;
		for(int temp:a)
		{
			System.out.println(temp);
		}
		System.out.println("second max element is");
		for(int x=a.length-1;x>=0;x--)
		{
			if(a[x]!=max)
			{
				smax=a[x];
				break;
			}
		}
		System.out.println(smax);

	}

}
