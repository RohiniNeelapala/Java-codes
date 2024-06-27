package com.basicprograms.patterns;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter start value");
	   int start=sc.nextInt();
	   System.out.println("enter num value");
	   int num=sc.nextInt();
	   System.out.println("enter count value");
	   int count=sc.nextInt();
	   while(start<=num)
	   {
		   if(num%start==0)
		  {
			   System.out.println(start);
			   count++;
		   }
		   start++;
	   }
         System.out.println((count==2)?"prime number":"not a prime number");
	}

}
