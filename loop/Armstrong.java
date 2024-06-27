package com.basicprograms.loop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		int sum=0,temp=number,count=0,remainder=0;
		while(number>0)//153>0
		{
			 remainder=number%10;//153%10  3   15%10   5   1%10   1   0
			count++;//1   2    3
			number=number/10;//153/10   15   15/10  1   1/10    0
		}
	      System.out.println(count);   //3
	      number=temp;  //153
		while(number>0)//153>0
		{
			remainder=number%10;//153%10  3   15%10   5   1%10   1   0
			int power=(int)Math.pow(remainder,count);  //27 125   1
			sum=sum+power;//27+125+1=153
			number=number/10;//15 1  0
		}
		System.out.println(sum);//153
		if(sum==temp)//153=153
		{
			System.out.println("armstrong number");//true
		}
		else
		{
			System.out.println("not a armstrong number");
		}
	

	}

}
