package com.basicprograms.loop;
import java.util.Scanner;
public class PrimeRange {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		while(number>0)
		{
			int remainder=number%10;
			int count=0;
			for(int start=1;start<=remainder;start++)
			{
				if(remainder%start==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(remainder);
			}
			number=number/10;
		}

	}

}
