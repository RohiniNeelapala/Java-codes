package com.basicprograms.arrays;

public class SortingAsc 
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {20,10,30,-1,100,-3,7,0};
		for(int x=0;x<a.length-1;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]>a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.print(a[x]+"  ");
		}

	}

}
