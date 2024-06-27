package com.basicprograms.strings;

public class StringMethods {

	public static void main(String[] args)
	{
		String s="rohini";
		String s1="";
		System.out.println(s.contains("in"));
		System.out.println(s.contains("eh"));
		  System.out.println(s.codePointAt(0));
		  System.out.println(s.codePointBefore(1));
		  char ch[]= {'h','e','l','l','o'};
		  s1=s1.copyValueOf(ch);
		  System.out.println(s1);
		  s1=s1.copyValueOf(ch, 0, 4);
		  System.out.println(s1);
		System.out.println(s.endsWith("i"));
		System.out.println(s.endsWith("o"));
	    System.out.println(s.indexOf("i"));
	    System.out.println(s.lastIndexOf("i"));
	    System.out.println(s.isEmpty());
	    System.out.println(s.replace('h', 's'));

	}

}
