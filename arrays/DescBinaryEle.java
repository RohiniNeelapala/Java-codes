package com.basicprograms.arrays;

public class DescBinaryEle
{

	public static void main(String[] args)
	{
		int a[]= {20,30,10,50,60,1};
		for(int x=0;x<a.length-1;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]<a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		for(int t:a)
		{
			System.out.print(t+"  ");
		}
		int search=100,mid,f=0,l=a.length-1,count=0;
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
				l=mid-1;
			}
			else if(search<a[mid])
			{
				f=mid+1;
			}
		}
		if(f>l)
		{
			System.out.println("element not found");
		}
		System.out.println("no of iterations "+count);


	}

}
