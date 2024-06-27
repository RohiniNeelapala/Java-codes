package com.basicprograms.practice;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int a[]= {50,40,30,20,10};
		int count=0;
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a.length-1-x;y++)
			{
				if(a[y]>a[y+1])
				{
					int t=a[y];
					a[y]=a[y+1];
					a[y+1]=t;
				}
			}
		}
		//
		System.out.println(count);
		for(int t:a)
		{
			System.out.println(t);
		}

	}

}
