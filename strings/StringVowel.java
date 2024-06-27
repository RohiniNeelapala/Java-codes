package com.basicprograms.strings;

public class StringVowel {

	public static void main(String[] args)
	{
		String s="Happy new year";
		String a[]=s.split(" ");
		char ch;
		int max=0;
		String s1="";
		for(int x=0;x<a.length;x++)
		{
			int count=0;
			String word=a[x];
		    for(int y=0;y<word.length();y++)
		    {
		    	ch=word.charAt(y);
		    	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		    	{
		    		count++;
		    	}
		    }
		    if(count>max)
		    {
		    	max=count;
		    	s1=word;
		    }
			
		}
		System.out.println(s1);
	}

}
