package com.basicprograms.arrays;

public class equaltok 
{

	public static void main(String[] args)
	{
		int a[]=new int[] {1,2,3,4,5,6,0,9};
		int k=5;
		for(int x=0;x<a.length-1;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]+a[y]==k)
				{
					System.out.println(a[x]+" "+a[y]);
				}
			}
		}

	}

}
