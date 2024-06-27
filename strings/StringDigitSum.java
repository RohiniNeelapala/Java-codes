package com.basicprograms.strings;

public class StringDigitSum {

	public static void main(String[] args) 
	{
		String s="hello123";
		int sum=0;
		for(int x=0;x<s.length();x++)
		{
			char letter=s.charAt(x);
			if(Character.isDigit(letter))
			{
				int digit=Character.getNumericValue(letter);
				sum=sum+digit;
			}
		}
		System.out.println(sum);

	}

}
