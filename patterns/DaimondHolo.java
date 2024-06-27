package com.basicprograms.patterns;

public class DaimondHolo {

	public static void main(String[] args) 
	{
		int rows=5;
		for(int x=1;x<rows;x++)
		{
			for(int y=rows;y>x;y--)
			{
				System.out.print("  ");
			}
			for(int z=1;z<=x;z++)
			{
				if(z==1)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int a=1;a<x;a++)
			{
				if(x==a+1)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<x;y++)
			{
				System.out.print("  ");
			}
			for(int z=rows;z>=x;z--)
			{
				if(z==rows)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int a=rows;a>x;a--)
			{
				if(x+1==a)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
