package com.basicprograms.patterns;

public class ReverseRightTri {

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

	}

}
