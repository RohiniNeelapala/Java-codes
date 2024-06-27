package com.basicprograms.arrays;
import java.util.Scanner;
public class SumEvenArray 
{

	public static void main(String[] args)
	{
		int a[]=new int[5];
		System.out.println(a.length);
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
			if(x%2==0)//0%2==0 2%2==0 4%2==0
			{
				sum=sum+a[x];//1+3+5
			}
		}
		System.out.println(sum);
		
		
	}

}
