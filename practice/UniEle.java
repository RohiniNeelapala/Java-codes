package com.basicprograms.practice;

public class UniEle {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,3,5,5,6,7,88,1};
		boolean b[]=new boolean[a.length];
		System.out.println("array elements are");
		for(int temp:a)
		{
			System.out.println(temp);
		}
		System.out.println("___________");
		for(int x=0;x<a.length;x++)
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
			if(count==1)
			{
				System.out.println(a[x]);
			}
		}

	}

}
