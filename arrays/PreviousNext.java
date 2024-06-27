package com.basicprograms.arrays;

public class PreviousNext
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,20,30,40,50,60};
		int b[]=new int[a.length];
		for(int x=0;x<a.length;x++)
		{
			if(x==0)
			{
				b[x]=a[x]+a[x+1];
			}
			else if(x==a.length-1)
			{
				b[x]=a[x]+a[x-1];
			}
			else
			{
				b[x]=a[x-1]+a[x+1];
			}
		}
        for(int x=0;x<a.length;x++)
        {
        	System.out.println(b[x]);
        }
	}

}
