package com.basicprograms.practice;

public class PrimeEle {

	public static void main(String[] args)
	{
		int a[]= {1,5,11,12,16,10,20};
		for(int x=0;x<a.length;x++)
		{
			int count=0;
			for(int y=1;y<=a[x];y++)
			{
				if(a[x]%y==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(a[x]);
			}
		}

	}

}
