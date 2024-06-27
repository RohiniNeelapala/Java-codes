package com.basicprograms.strings;

public class StringPalindrome {

	public static void main(String[] args)
	{
		String s="mom";
		String reverse="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			reverse=ch+reverse;
		}
		if(s.equals(reverse))
		{
			System.out.println("palindrome");
		}
       System.out.println("__________________");
       String rev="";
       for(int x=s.length()-1;x>=0;x--)
       {
    	   char ch=s.charAt(x);
    	   rev+=ch;
       }
       if(s.equals(rev))
       {
    	   System.out.println("palindrome");
       }
	}

}
