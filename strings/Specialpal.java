package com.basicprograms.strings;

public class Specialpal 
{

	public static void main(String[] args)
	{
		//String s="a man @ 1 a plan # 2 a canal * 3 panama $% 4";
		String s="wow";
		String temp="",rev="";
		for(int x=0;x<s.length();x++)//0
		{
			char ch=s.charAt(x);
		  if(ch>='a'&&ch>='z')
		  {
			  temp+=ch;//w
			  rev=ch+rev;//w
		  }
		}
		if(temp.equals(rev))
		{
			System.out.println("P");
		}

	}

}
