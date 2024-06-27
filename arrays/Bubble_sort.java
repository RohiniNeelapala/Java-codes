package com.basicprograms.arrays;

public class Bubble_sort {

	public static void main(String[] args)
	{
		int a[]=new int[] {50,40,30,20,10};
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
		for(int temp:a)
		{
			System.out.println(temp);
		}

	}

}
