package com.basicprograms.loop;

public class TechnologyNo {

	public static void main(String[] args) 
	{
		int number=2025,temp=number,count=0,num1=0,num2=0;
		while(temp>0)
		{
			int rem=temp%10;
			count++;
			temp=temp/10;
		}
		if(count%2==0)
		{
		   num1=number%(int)Math.pow(10, count/2);
		   num2=number/(int)Math.pow(10, count/2);
		   int sum=num1+num2;
		   int square=sum*sum;
		   if(square==number)
		   {
			   System.out.println("technology number");
		   }
		   else
		   {
			   System.out.println("not a technology number");
		   }
		}
		else
		{
			System.out.println("not a technology number");
		}
		

	}

}
