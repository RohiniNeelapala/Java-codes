package com.basicprograms.arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args)
	{
		int a[]=new int[] {20,10,7,40,8,10,6,9,4};
		Arrays.sort(a);
		int search=6,mid,f=0,l=a.length-1,count=0;
		while(f<=l)
		{
			mid=(f+l)/2;
			count++;
			if(search==a[mid])
			{
				System.out.println("element found");
				break;
			}
			else if(search>a[mid])
			{
				f=mid+1;
			}
			else if(search<a[mid])
			{
				l=mid-1;
			}
		}
		if(f>l)
		{
			System.out.println("element not found");
		}
		System.out.println("no of iterations "+count);

	}

}
