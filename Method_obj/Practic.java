package com.basicprograms.Method_obj;

public class Practic 
{

	public static void main(String[] args)
	{
		Abc1 abc=new Abc1();
		System.out.println(abc.Leap(2024));

	}

}
class Abc1
{
	String Leap(int x)
	{
		if(x%4==0&&x%100!=0||x%400==0)
		{
			return x+" leap year";
		}
		else
		{
			return x+" not a leap year";
		}
		
	}
}