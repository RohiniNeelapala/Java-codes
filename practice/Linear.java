package com.basicprograms.practice;

public class Linear {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		int search=6;
		int count=0;
		for(int x=0;x<a.length;x++)
		{
			if(search==a[x])
			{
				System.out.println("element found");
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("element not found");
		}

	}

}
