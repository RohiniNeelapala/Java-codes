package com.basicprograms.arrays2D;

public class Arrpractice
{

	public static void main(String[] args)
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int c[][]=new int[3][3];
		for(int r=0;r<a.length;r++)
		{
			for(int c1=0;c1<a[r].length;c1++)
			{
				c[r][c1]=a[r][c1]+b[r][c1];
			}
		}
		for(int[] temp:c)
		{
			for(int temp2:temp)
			{
				System.out.print(temp2+" ");
			}
			System.out.println();
		}
	}

}
