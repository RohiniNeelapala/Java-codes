package com.basicprograms.Method_obj;

public class ArmstrongWithRT 
{

	public static void main(String[] args) 
	{
		Hello hello=new Hello();
		String result=hello.ArmOrNot();
		System.out.println(result);

	}

}
class Hello
{
	int num=371,temp=num;
	String ArmOrNot()
	{
		int count=0,sum=0;
		for(;num>0;num=num/10)
		{
			int rem=num%10;
			count++;
		}
		num=temp;
		for(;num>0;num=num/10)
		{
			int rem=num%10;
			int power=(int)Math.pow(rem, count);
			sum=sum+power;
		}
		if(sum==temp)
		{
			return temp+" armstrong";
		}
		else
			return temp+" not armstrong";
	}
}