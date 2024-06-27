package com.basicprograms.loop;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start value:");
		int start=sc.nextInt();
		System.out.println("enter end value:");
		int end=sc.nextInt();
		int factorial=sc.nextInt();
		while(start<=end)
		{
			factorial=factorial*start;
			start++;
		}
          System.out.println(factorial);
	}

}
