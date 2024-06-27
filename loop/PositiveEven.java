package com.basicprograms.loop;
import java.util.Scanner;
public class PositiveEven {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start value:");
		int start=sc.nextInt();
		System.out.println("enter end value:");
		int end=sc.nextInt();
		while(start<=end)
		{
			if(start>0)
			{
				if(start%2==0)
				{
					System.out.println(start+" positive even");
				}
				else
				{
					System.out.println(start+" positive odd");
				}
				
			}
			else if(start<0)
			{
				if(start%2==0)
				{
					System.out.println(start+" negitive even");
				}
				else
				{
					System.out.println(start+" negitive odd");
				}
			}
			start++;
		
		}

	}

}
