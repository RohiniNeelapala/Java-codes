package com.basicprograms.loop;

public class Pttern_2 {

	public static void main(String[] args) 
	{
		int rows=5,cols=5;
		for(int x=1;x<=rows;x++)
		{
			for(int y=1;y<=cols;y++)//1<=5  2<=5 5<=5  //1<=5 5<=5//1<=5  2<=5  5<=5
			{
				if(x==y)//1==1  1==2   1==5  //2==1  2==2//3==1  3==2  3==3
				{
					System.out.print("* ");// *   *    *
				}
				else
				{
					System.out.print(" "); //   
				}
			}
			System.out.println();
		}

	}

}
