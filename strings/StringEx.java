package com.basicprograms.strings;

public class StringEx {

	public static void main(String[] args) 
	{
		String s="hello all";
		System.out.println(s.length());
		for(int x=0;x<s.length();x++)
		{
			char letter=s.charAt(x);
			System.out.println(letter);
		}
        s=s.toUpperCase();
        System.out.println(s);
        s=s.toLowerCase();
        System.out.println(s);
        }

}
