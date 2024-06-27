package com.basicprograms.practice;

public class SortUsingLoop {

	public static void main(String[] args)
	{
		int a[]= {121,12,23,56,2,3,40};
		for(int x=0;x<a.length-1;x++)
		{
			if(a[x]>a[x+1])
			{
				int temp=a[x];
				a[x]=a[x+1];
				a[x+1]=temp;
				x=-1;
			}
		}
		for(int t:a)
		{
			System.out.println(t);
		}

	}

}
