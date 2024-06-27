package com.basicprograms.practice;

public class SelectionSort {

	public static void main(String[] args)
	{
		int a[]= {20,30,5,10,12,15};
		int min=0;
		for(int x=0;x<a.length;x++)
		{
			min=x;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[min]>a[y])
				{
					min=y;
				}
			}
			int temp=a[x];
			a[x]=a[min];
			a[min]=temp;
		}
		for(int t:a)
		{
			System.out.println(t);
		}

	}

}
