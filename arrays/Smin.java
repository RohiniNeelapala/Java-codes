package com.basicprograms.arrays;

public class Smin 
{

	public static void main(String[] args)
	{
		int a[]=new int[] {20,40,5,9,10,6};
		int min=Integer.MAX_VALUE;
		int Smin=Integer.MAX_VALUE;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<min)
			{
				Smin=min;
				min=a[x];
			
				
			}
			else if(a[x]>min&&a[x]<Smin)
			{
				Smin=a[x];
			}
		}
		System.out.println(Smin);

	}

}
