package com.basicprograms.arrays2D;

public class Sum 
{

	public static void main(String[] args)
	{
		int a[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int r=0;r<3;r++)
		{
			for(int c=0;c<3;c++)
			{
				sum=sum+a[r][c];
			}
		}
		System.out.println(sum);

	}

}
