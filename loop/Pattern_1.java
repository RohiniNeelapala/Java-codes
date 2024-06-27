package com.basicprograms.loop;

public class Pattern_1 {

	public static void main(String[] args)
	{
		int rows=5,cols=5;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=cols;y++)//1<=5  2<=5 3<=5 4<=5 5<=5  1<=5 2<=5 5<=5  1<=5 5<=5 1<=5
			{
				if(x==1||x==rows||y==1||y==cols)//x==1 x==1 x==1 x==1 x==1   y==1 y==5 y==1 y==5 y==1 y==5 
				{
					System.out.print("* ");//* * * * *   *     *  *     *  *     *  * * * * *
				}
				else
				{
					System.out.print("  ");
				}
				//System.out.println();
			}
			System.out.println();
		}

	}

}
