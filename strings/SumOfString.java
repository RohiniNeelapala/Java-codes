package com.basicprograms.strings;

public class SumOfString {

	public static void main(String[] args) 
	{
		String s="121";
		int num=Integer.parseInt(s);
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
        System.out.println(sum);
	}

}
