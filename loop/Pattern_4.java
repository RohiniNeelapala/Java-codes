package com.basicprograms.loop;

public class Pattern_4 {

	public static void main(String[] args) 
	{
		int rows=7,cols=7;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=cols;y++)
			{
				if(x+y==rows+1||x==y||x==1||x==rows||y==1||y==cols)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

}
