package com.basicprograms.arrays;

public class UniqueElements {

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,5,8,3,5,9,8,10};
		boolean b[]=new boolean[a.length];
		System.out.println("array elements are");
		for(int temp:a)
		{
			System.out.println(temp);
		}
		System.out.println("unique elements are");
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
					b[x]=true;
					
				}
			}
			if(count==1)
			{
				System.out.println(a[x]);
			}
		}
		

	}

}
