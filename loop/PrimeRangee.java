package com.basicprograms.loop;

public class PrimeRangee
{

	public static void main(String[] args) 
	{
		for(int start=1;start<=10;start++)
		{
			int count=0;
			for(int i=1;i<=start;i++)
			{
				if(start%i==0)
				{
					count++;
				}
			}
			System.out.println((count==2)?start+" prime":start+" not a prime");
		}
		
	}

}
