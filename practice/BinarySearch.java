package com.basicprograms.practice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int a[]= {40,70,10,6,9,3,0};
		Arrays.sort(a);
		int search=5,mid,f=0,l=a.length-1;
		int count=0;
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
		System.out.println("___________");
		int b[]= {20,40,50,0,1,8,9};
		for(int x=0;x<b.length;x++)
		{
			for(int y=x+1;y<b.length;y++)
			{
				if(b[x]<b[y])
				{
					int temp=b[x];
					b[x]=b[y];
					b[y]=temp;
				}
			}
		}
		for(int t:b)
		{
			System.out.println(t);
		}
		int search1=1,mid1,f1=0,l1=a.length-1,count1=0;
		while(f1<=l1)
		{
			mid1=(f1+l1)/2;
			count1++;
			if(search1==b[mid1])
			{
				System.out.println("element found");
				break;
			}
			else if(search1>b[mid1])
			{
				l1=mid1-1;
			}
			else if(search1<b[mid1])
			{
				f1=mid1+1;
			}
		}
		if(f1>l1)
		{
			System.out.println("element not found");
		}
	}

}
