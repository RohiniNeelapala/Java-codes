package com.basicprograms.patterns;

public class Daimond 
{

	public static void main(String[] args)
	{
		int rows=5;
		for(int x=1;x<rows;x++)
		{
			for(int y=rows;y>=x;y--)
			{
				System.out.print("  ");
			}
			for(int z=1;z<=x;z++)
			{
				System.out.print("* ");
			}
			for(int a=2;a<=x;a++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print("  ");
			}
			for(int z=rows;z>=x;z--)
			{
				System.out.print("* ");
			}
			for(int a=rows;a>x;a--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
