package com.basicprograms.patterns;

public class TwoTri {

	public static void main(String[] args) 
	{
		int rows=5;
		for(int x=1;x<=rows;x++)
		{
			for(int y=rows;y>=x;y--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int x=2;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
