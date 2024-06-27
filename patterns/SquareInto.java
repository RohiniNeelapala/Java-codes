package com.basicprograms.patterns;

public class SquareInto 
{

	public static void main(String[] args) 
	{
		int rows=7,cols=7;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=cols;y++)
			{
				if(x==1||x==rows||y==1||y==cols||x==y||x+y==rows+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
