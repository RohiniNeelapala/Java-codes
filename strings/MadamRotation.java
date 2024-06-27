package com.basicprograms.strings;

public class MadamRotation {

	public static void main(String[] args)
	{
         String s="madam";
	    
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(0);
			String word=s.substring(1,s.length());
			s=word+ch;
			StringBuffer sb=new StringBuffer(s);
			sb.reverse();
			if(s.contentEquals(sb))
			{
				System.out.println(s+" palindrome");
			}
			else
			{
				System.out.println(s+" not a palindrome");
			}
		}
		System.out.println("_____________");
		for(int x=0;x<s.length();x++)
		{
			String s1=s.substring(x+1, s.length())+s.substring(0, x+1);
			StringBuffer sb=new StringBuffer(s1);
			sb.reverse();
			if(s1.contentEquals(sb))
			{
				System.out.println(s1+" palindrome");
			}
			else
			{
				System.out.println(s1+" not a palindrome");
			}
		}

	}

}
