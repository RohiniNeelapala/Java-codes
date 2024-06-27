package com.basicprograms.arrays2D;

public class LeftDaigonal
{

	public static void main(String[] args)
	{
		int a[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int lsum=0,rsum=0;
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				if(r==c)
				{
					lsum=lsum+a[r][c];
					System.out.print(a[r][c]);
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(lsum);
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				if(r+c==a.length-1)
				{
					rsum=rsum+a[r][c];
					System.out.print(a[r][c]);
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(rsum);
		if(lsum>=rsum)
		{
			System.out.println("left daigonal sum is large "+lsum);
		}
		else
		{
			System.out.println("right daigonal sum is large"+rsum);
		}

	}

}
