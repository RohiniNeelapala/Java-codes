package com.basicprograms.arrays;
import java.util.Scanner;
public class Arrayusingsc
{

	public static void main(String[] args)
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
		for(int x=a.length-1;x>=0;x--)
		{
			System.out.println(a[x]);
		}
		int sum=0;
		for(int x=0;x<a.length;x++)
		{
			sum=sum+a[x];
		}
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
				System.out.println(a[x]);
		}

	}

}
