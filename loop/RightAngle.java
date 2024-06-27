package com.basicprograms.loop;

public class RightAngle {

	public static void main(String[] args) 
	{
		for(int x=1;x<=5;x++)
		{
			for(int y=1;y<=x;y++)//1<=1  //1<=2  2<=2  //1<=3 2<=3 3<=3 //1<=4 2<=4 3<=4 4<=4//1<=5 2<=5 3<=5 4<=5 5<=5
			{
				System.out.print(y+" ");   //1  //1 2  //1 2 3  //1 2 3 4 //1 2 3 4 5
			}
			System.out.println();
		}

	}

}
    
