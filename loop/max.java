package com.basicprograms.loop;
import java.util.Scanner;
public class max {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		int max=0,min=9,temp=number;
		while(number>0)//3456>0
		{
			int remainder=number%10;//3456%10 6
			max=(int)Math.max(max, remainder);//6
			number=number/10;//3456/10 345
		}
		number=temp;
		while(number>0)
		{
			int remainder=number%10;
			min=(int)Math.min(min, remainder);
			number=number/10;
		}
		
		System.out.println(max);
		 System.out.println(min);

	}

}

