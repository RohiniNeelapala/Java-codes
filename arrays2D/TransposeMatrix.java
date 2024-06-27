package com.basicprograms.arrays2D;
import java.util.Scanner;
public class TransposeMatrix {

	public static void main(String[] args)
	{
		int rows=3,cols=3;
		int a[][]=new int[rows][cols];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array values");
		for(int x=0;x<rows;x++)
		{
			for(int y=0;y<cols;y++)
			{
				a[x][y]=sc.nextInt();
				System.out.print(a[y][x]);
			}
			System.out.println();
		}

	}

}
