package com.basicprograms.practice;

import java.util.Scanner;

public class ArraysPractice {

	public static void main(String[] args)
	{
		int a[]=new int[5];
		System.out.println(a.length);
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
		int sum=0,pro=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		for(int x=0;x<a.length;x++)
		{
			sum=sum+a[x];
			pro=pro*a[x];
		}
		System.out.println(sum);
		System.out.println(pro);
		for(int x=a.length-1;x>=0;x--)
		{
			System.out.println(a[x]);
		}
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
			{
				System.out.println(a[x]);
			}
		}
		for(int x=0;x<a.length;x++)
		{
			if(x%2==0)
			{
				System.out.println(a[x]);
			}
		}
}

}
