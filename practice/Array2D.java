package com.basicprograms.practice;

public class Array2D {

	public static void main(String[] args)
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int x=0;x<3;x++)
		{
			for(int y=0;y<3;y++)
			{
				sum=sum+a[x][y];
				System.out.println(a[x][y]);
			}
		}
		System.out.println(sum);
		

	}

}
