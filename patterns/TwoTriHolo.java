package com.basicprograms.patterns;

public class TwoTriHolo {

	public static void main(String[] args) 
	{
		int rows=5;
		for(int x=1;x<=rows;x++)
		{
			for(int y=rows;y>=x;y--)
			{
				if(x==1||y==rows||x==y)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int x=2;x<=rows;x++)
		{
			for(int y=1;y<=x;y++)
			{
				if(y==1||x==y||x==5)
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
