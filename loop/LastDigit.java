package com.basicprograms.loop;
import java.util.Scanner;
public class LastDigit 
{

	public static void main(String[] args)
	{
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter a number");
	     int number=sc.nextInt();
	     int count=0;
	     while(number>0)
	     {
	    	 int remainder=number%10;
	    	 System.out.println(remainder);
	    	 count++;
	    	 number=number/10;
	     }
	     System.out.println(count);
	     

	}

}
