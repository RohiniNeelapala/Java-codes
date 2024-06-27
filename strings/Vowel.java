package com.basicprograms.strings;

public class Vowel {

	public static void main(String[] args)
	{
		String s="hello";
		int count=0,count1=0;
		String temp="",temp1="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count++;
				temp+=ch;
			}
			else
			{
				count1++;
				temp1+=ch;
			}
		}
          System.out.println(temp+" "+count);
          System.out.println(temp1+" "+count1);
	}

}
