package com.basicprograms.practice;

import java.util.Scanner;

public class ForEach2D {

	public static void main(String[] args)
	{
		int rows=3,cols=3;
		int a[][]=new int[rows][cols];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		for(int x=0;x<rows;x++)
		{
			for(int y=0;y<cols;y++)
			{
				a[x][y]=sc.nextInt();
				
			}
		}
		for(int[] temp:a)
		{
			for(int temp1:temp)
			{
				System.out.println(temp1);
			}
		}
		System.out.println("______________");
		for(int x=0;x<rows;x++)
		{
			for(int y=0;y<cols;y++)
			{
				System.out.println(a[y][x]);
			}
		}

	}

}
