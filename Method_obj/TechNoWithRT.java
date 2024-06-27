package com.basicprograms.Method_obj;

public class TechNoWithRT 
{

	public static void main(String[] args) 
	{
		Myworld obj=new Myworld();
		System.out.println(obj.Number());

	}

}
class Myworld
{
	int num=2025,temp=num,sum=0;
	String Number()
	{
		int count=0,square=0;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		temp=num;
		if(count%2==0)
		{
			int num1=num%(int)Math.pow(10, count/2);
			int num2=num/(int)Math.pow(10, count/2);
			sum=num1+num2;
			square=sum*sum;
			if(square==temp)
			{
				return "tech no";
			}
			else
			{
				return "not tech";
			}
		}
		else
		{
			return "not a tech";
		}
		
	}
}
