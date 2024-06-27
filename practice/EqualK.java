package com.basicprograms.practice;

public class EqualK {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,7,9};
		int k=5;
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length-1;y++)
			{
				if(a[x]+a[y]==k)
				{
					System.out.println(a[x]+" "+a[y]);
				}
			}
		}

	}

}
