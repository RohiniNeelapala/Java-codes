package com.basicprograms.practice;

import java.util.Arrays;

public class SecSmall {

	public static void main(String[] args) 
	{
		int a[]= {12,12,4,7,8,9,10};
		Arrays.sort(a);
		int min=a[0],smin=0;
		for(int t:a)
		{
			System.out.println(t);
		}
		System.out.println("____");
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
