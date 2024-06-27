package com.basicprograms.loop;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int num1=0,num2=1,n=10,num3=0;
        for(int i=0;i<=n;i++)
        {
        	num3=num1+num2;//0+1=1//1+1=2//2+1=3//5//8
        	System.out.print(num1+" ");
        	num1=num2;//1//1//2//3
        	num2=num3;//1//2//3//5
        }
	}

}
      