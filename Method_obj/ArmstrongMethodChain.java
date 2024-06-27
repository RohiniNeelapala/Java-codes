package com.basicprograms.Method_obj;

public class ArmstrongMethodChain 
{
    int num=371,temp,sum=0;
	public static void main(String[] args)
	{
		ArmstrongMethodChain ab=new ArmstrongMethodChain();
		System.out.println(ab.Armstong());

	}
	int six()
	{
		temp=num;
		System.out.println(temp);
		int count=0;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		return count;
	}
	String Armstong()
	{
		
		int res=six();
		temp=num;
		while(temp>0)
		{
			int rem=temp%10;
			int power=(int)Math.pow(rem, res);
			sum=sum+power;
			temp=temp/10;
		}
	    return sum==num?"arm":"not arm";
	}

	

}
