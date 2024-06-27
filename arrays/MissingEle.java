package com.basicprograms.arrays;

public class MissingEle 
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,5,6,7,9};
		for(int x=0;x<a.length-1;x++)
		{//0//1
			if(a[x]+1!=a[x+1])
			{
				System.out.println("missing value is "+(a[x]+1));
			}
		}
		
	}

}
