package com.basicprograms.loop;

public class DaimondPattern {

	public static void main(String[] args)
	{
		int rows=4;
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
			for(int i=rows;i>x;i--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
