package com.basicprograms.strings;

public class UpperToLower
{

	public static void main(String[] args)
	{
		String s= "RohiNi NeeLapAla";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(ch>='a'&&ch<='z')
			{
				int convert=ch-32;
				char upper=(char)convert;
				System.out.println(upper);
			}
			else if(ch>='A'&&ch<='Z')
			{
				int convert=ch+32;
				char small=(char)convert;
				System.out.println(small);
			}
		}

	}

}
