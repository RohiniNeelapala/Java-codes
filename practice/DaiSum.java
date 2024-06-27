package com.basicprograms.practice;

public class DaiSum {

	public static void main(String[] args)
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int lsum=0,rsum=0;
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a[x].length;y++)
			{
				if(x==y)
				{
					lsum=lsum+a[x][y];
					System.out.print(a[x][y]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println(lsum);
		System.out.println("____________");
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a[x].length;y++)
			{
				if(x+y==a.length-1)
				{
					rsum=rsum+a[x][y];
					System.out.print(a[x][y]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println(rsum);
		System.out.println("__________");
		if(lsum>rsum)
		{
			System.out.println("left dai sum is large "+lsum);
		}
		else if(rsum>lsum)
		{
			System.out.println("right dai sum is large "+rsum);
		}
		else
		{
			System.out.println("both sums are equal");
		}

	}

}
