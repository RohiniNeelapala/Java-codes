package com.basicprograms.patterns;

public class ReverseLine
{

	public static void main(String[] args) 
	{
		int rows=5,cols=5;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=cols;y++)
			{
				if(x+y==rows+1)
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
