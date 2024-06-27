package com.basicprograms.loop;

public class Pattern_3 {

	public static void main(String[] args)
	{
		int rows=5,cols=5;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=cols;y++)//1 1<=5  2<=5  3<=5   4<=5  5<=5
			{
				if(x+y==rows+1)//1+1==6  1+2==6   1+3==6  1+4==6   1+5==6
				{
					System.out.print("* "); ///*
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
