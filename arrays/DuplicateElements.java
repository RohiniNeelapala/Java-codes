package com.basicprograms.arrays;

public class DuplicateElements
{

	public static void main(String[] args)
	{
		int a[]=new int[] {20,10,20,30,5,6,7,6,10};
		boolean b[]=new boolean[a.length];
		System.out.println("Array elements are");
		for(int temp:a)
		{
			System.out.println(temp);
		}
		System.out.println("duplicate elements are");
		for(int x=0;x<a.length-1;x++)
		{
			int count=1;
			if(b[x]==true)
			{
				continue;
			}
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=true;
				}
			}
			if(count>1)
			{
				System.out.println(a[x]);
			}
			
		}

	}

}
