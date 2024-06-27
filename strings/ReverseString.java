package com.basicprograms.strings;

public class ReverseString {

	public static void main(String[] args)
	{
		String s="madam arora teaches malayalam";
		String a[]=s.split(" ");
		for(int x=0;x<a.length;x++)
		{
			String word=a[x];
			StringBuffer sb=new StringBuffer(word);
			sb.reverse();
			if(word.contentEquals(sb))
			{
				System.out.println(word);
			}
		}

	}

}
