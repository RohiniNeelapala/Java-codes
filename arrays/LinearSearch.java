package com.basicprograms.arrays;

public class LinearSearch
{

	public static void main(String[] args)
	{
		int a[]=new int[] {121,12,3,4,6,8,9,100};
		int search=80;
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
