package com.basicprograms.loop;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value:");
        int a=sc.nextInt();
        System.out.println("enter b value:");
        int b=sc.nextInt();
        System.out.println("before swapping:");
        System.out.println(a);
        System.out.println(b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping:");
        System.out.println(a);
        System.out.println(b);
        		

	}

}
