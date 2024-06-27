package com.basicprograms.loop;

public class StrongNumber {

	public static void main(String[] args)
	{
		int end=500;
		for(int start=1;start<=end;start++)
		{
			int sum=0,factorial;
			for(int num=start;num>0;num=num/10)//10>0//11//145
			{
				int rem=num%10;factorial=1;//0//1//145%10=5  4
				for(;rem>0;rem--)//1//5>0   4>0
				{
				factorial=factorial*rem;//1*5=5  5*4=20
				}
				sum=sum+factorial;
			}
			if(sum==start)
			{
			    System.out.println(start+" is strong number");
			}
		}

	}

}
