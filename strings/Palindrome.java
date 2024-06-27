package com.basicprograms.strings;

public class Palindrome {

	public static void main(String[] args)
	{
		String s="mom";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String reverse=sb.toString();
		if(s.equals(reverse))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
