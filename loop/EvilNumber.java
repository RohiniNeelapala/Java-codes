package com.basicprograms.loop;

public class EvilNumber {

	public static void main(String[] args) 
	{
		int number=9,sum=0;
		int power=(int)Math.pow(number, 2);
		while(power>0)
		{
			int remainder=power%10;
			sum=sum+remainder;
			power=power/10;
			
		}
		if(sum==number)
		{
			System.out.println("evil number");
		}

	}

}
