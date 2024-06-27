package com.basicprograms.patterns;

public class SquareHolo {

	public static void main(String[] args) 
	{
		int rows=5,cols=5;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=rows;y++)
			{
				if(x==1||x==rows||y==1||y==cols)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
