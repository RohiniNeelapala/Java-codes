package com.basicprograms.loop;

public class ForLoopFactors {

	public static void main(String[] args) 
	{
		 int count=0;
		for(int num=1;num<=10;num++)//1<=10  
		{
			count=0;
			for(int start=1;start<=num;start++)//1<=1  2<=1
			{
				if(num%start==0)//1%1==0
				{
					count++;//1
				}
			}
			System.out.println("no of factors of "+num+" is "+count);//1
		}

	}

}
