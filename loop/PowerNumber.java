package com.basicprograms.loop;

public class PowerNumber {

	public static void main(String[] args) 
	{
		int number=132,temp=number,sum=0,product=1;
		while(number>0)
		{
			int remainder=number%10;
			sum=sum+remainder;
			product=product*remainder;
			number=number/10;
		}
		if(sum==product)
		{
			System.out.println("power number");
		}

	}

}
