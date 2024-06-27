package com.basicprograms.practice;

public class Min {

	public static void main(String[] args)
	{
		int a[]= {10,5,1,-4,-1};
		System.out.println(a.length);
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
