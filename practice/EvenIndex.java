package com.basicprograms.practice;

import java.util.Scanner;

public class EvenIndex {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		System.out.println(a.length);
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
			if(x%2==0)
			{
				sum=sum+a[x];
			}
		}
		System.out.println(sum);

	}

}
