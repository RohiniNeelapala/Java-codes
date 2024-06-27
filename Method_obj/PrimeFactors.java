package com.basicprograms.Method_obj;

public class PrimeFactors
{
    int num=24; 
	public static void main(String[] args) 
	{
		PrimeFactors abc=new PrimeFactors();
		System.out.println(abc.prim());
	}
	int factor()
	{
		int count=0;
		for(int start=1;start<=num;start++)
		{
			if(num%start==0)
				count++;
		}
		return count;
	}
	String prim()
	{
		int temp=factor();
		return temp==2?"p":"np";
	}

}
