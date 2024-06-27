package com.basicprograms.arrays;

import java.util.Arrays;

public class SecondSmallest
{

	public static void main(String[] args)
	{
		int a[]=new int[] {12,4,6,7,9,10,23};
		Arrays.sort(a);
		int min=a[0],smin=0;
		for(int temp:a)
		{
			System.out.print(temp+"  ");
		}
		System.out.println();
		System.out.println("second smallest element ");
		for(int x=0;x<a.length;x++)
		{
			if(a[x]!=min)
			{
				smin=a[x];
				break;
			}
		}
		System.out.println(smin);

	}

}
