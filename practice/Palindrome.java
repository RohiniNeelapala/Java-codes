package com.basicprograms.practice;

public class Palindrome {

	public static void main(String[] args)
	{
		int a[]= {1,11,3,121,145,222,30};
		for(int x=0;x<a.length;x++)
		{
			int rev=0;
			for(int y=a[x];y>0;y=y/10)
			{
				int rem=y%10;
				rev=rev*10+rem;
			}
			if(a[x]==rev)
			{
				System.out.println(a[x]);
			}
		}

	}

}
