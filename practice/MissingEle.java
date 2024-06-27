package com.basicprograms.practice;

public class MissingEle {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,5,6,7,8};
		for(int x=0;x<a.length-1;x++)
		{
			if(a[x]+1!=a[x+1])
			{
				System.out.println("miss element is "+(a[x]+1));
			}
		}

	}

}
