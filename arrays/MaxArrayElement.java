package com.basicprograms.arrays;
import java.util.Scanner;
public class MaxArrayElement 
{

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		System.out.println(a.length);
		int max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
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
