package com.basicprograms.strings;

public class StringDigits {

	public static void main(String[] args)
	{
		String s="Hel@1lo2 all 3@ 4";
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			char letter=s.charAt(x);
			if(Character.isDigit(letter))
			{
				s1=s1+letter;
			}
		}
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		 if(s1.contentEquals(sb))
	     {
	        	System.out.println("palindrome");
	     }
		 else
		 {
			 System.out.println("not a palindrome");
		 }
       
	}

}
