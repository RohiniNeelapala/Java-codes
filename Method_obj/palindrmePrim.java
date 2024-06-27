package com.basicprograms.Method_obj;

public class palindrmePrim
{

	public static void main(String[] args)
	{
		One obj1=new One();
		obj1.Palindrome();
		obj1.prime();

	}

}
class One
{
	int num=121,temp=num;
	void Palindrome()
	{
		int reverse=0;
		for(;num>0;num=num/10)
		{
			int remainder=num%10;
			reverse=reverse*10+remainder;
		}
		if(reverse==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
	void prime()
	{
		int count=0;
		for(int start=1;start<=temp/2;start++)
		{
			if(temp%start==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not a prime");
		}
	}
}