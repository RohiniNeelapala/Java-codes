package com.basicprograms.loop;
import java.util.Scanner;
public class factors {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start value:");
		int start=sc.nextInt();
		System.out.println("enter num value:");
		int num=sc.nextInt();
		int end=num;
		
		System.out.println("enter count value:");
		int count=sc.nextInt();
		while(start<=end)
		{
			if(num%start==0)
			{
				System.out.println(start);
				count++;
			}
			start++;
		}
		System.out.println("no of factors of "+num+" is "+count);
		
		

	}

}
