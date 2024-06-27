package com.basicprograms.arrays;

public class PracticeArrays
{

	public static void main(String[] args)
	{
		int a[]=new int[] {700,20,10,1,8,2,20,-1};
		int count=0,sum=0,max=0,min=Integer.MAX_VALUE;
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
			count++;
			sum=sum+a[x];
		}
		System.out.println(count);
		System.out.println(sum);
		for(int x=a.length-1;x>=0;x--)
		{
			System.out.println(a[x]);
		}
		System.out.println();
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
			{
				System.out.println(a[x]);
			}
		}
		System.out.println();
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>max)
			{
				max=a[x];
			}
		}
		System.out.println(max);
		System.out.println("-------------");
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<min)
			{
				min=a[x];
			}
		}
		System.out.println(min);
		System.out.println("-------------------------");
		int b[]=new int[] {10,20,30,40,50};
		int c[]=new int[b.length];
		for(int x=0;x<b.length;x++)
		{
			if(x==0)
			{
				c[x]=b[x]+b[x+1];
			}
			else if(x==b.length-1)
			{
				c[x]=b[x-1]+b[x];
			}
			else
			{
				c[x]=b[x-1]+b[x+1];
			}
		}
		for(int t:c)
		{
			System.out.println(t);
		}
	}

}
