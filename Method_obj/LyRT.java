package com.basicprograms.Method_obj;

public class LyRT {

	public static void main(String[] args)
	{
		LyRT ex=new LyRT();
		System.out.println(ex.Leap(2024));

	}
    String Leap(int year)
    {
    	if(year%4==0&&year%100!=0||year%400==0)
    	{
    		return year+" leap year";
    	}
    	else
    	{
    		return year+" not a leap year";
    	}
    }
}
