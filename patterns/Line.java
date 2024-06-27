package com.basicprograms.patterns;

public class Line {

	public static void main(String[] args)
	{
		int rows=5,cols=5;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=cols;y++)
			{
				if(x==y)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
