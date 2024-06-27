package com.basicprograms.practice;

import java.util.Arrays;

public class Secmax {

	public static void main(String[] args)
	{
		int a[]= {12,4,6,7,90,60};
		Arrays.sort(a);
		int max=a[a.length-1],smax=0;
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
