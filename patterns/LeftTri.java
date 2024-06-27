package com.basicprograms.patterns;

public class LeftTri 
{

	public static void main(String[] args)
	{
		int rows=5;
		for(int x=1;x<=rows;x++)
		{
			for(int y=rows;y>x;y--)
			{
				System.out.print("  ");
			}
			for(int z=1;z<=x;z++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
