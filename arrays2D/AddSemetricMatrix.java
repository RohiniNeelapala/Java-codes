package com.basicprograms.arrays2D;

public class AddSemetricMatrix
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
		for(int r=0;r<a.length;r++)
		{
			for(int y=0;y<a[r].length;y++)
			{
				System.out.print(c[r][y]+"  ");
			}
			System.out.println();
		}

	}

}
