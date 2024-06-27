package com.basicprograms.Method_obj;

public class FizzBussWithRT
{
    int num=15;
	public static void main(String[] args) 
	{
		FizzBussWithRT obj=new FizzBussWithRT();
		System.out.println(obj.fizzbuzz());

	}
	String fizzbuzz()
	{
		if(num%3==0&&num%5==0)
			return "fizbuzz";
		else if(num%3==0)
			return "fizz";
		else if(num%5==0)
			return "buzz";
		else
			return "invalid input";
	}

}
