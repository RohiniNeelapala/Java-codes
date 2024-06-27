package com.basicprograms.practice;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) 
	{
		int a[]= new int[10];
		int max=Integer.MIN_VALUE;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
			if(a[x]>max)
			{
				max=a[x];
			}
		}
		System.out.println(max);

	}

}
