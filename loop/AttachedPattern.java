package com.basicprograms.loop;

public class AttachedPattern 
{

	public static void main(String[] args)
	{
		int rows=4;
		for(int x=1;x<rows;x++)
		{
			for(int y=rows;y>=x;y--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
