package com.basicprograms.strings;

public class Example
{

	public static void main(String[] args)
	{
	  String s="hello all GoOd morning";
	  String a[]=s.split(" ");
	  char ch=' ';
	  String temp=a[0];
	  a[0]=a[a.length-1];
	  a[a.length-1]=temp;
	  for(int x=1;x<a.length-1;x++)
	  {
		  String word=a[x];
		  for(int y=0;y<word.length();y++)
		  {
			  ch=word.charAt(x);
			  if(Character.isAlphabetic(ch))
			  {
				  if(Character.isLowerCase(ch))
				  {
					  ch=Character.toUpperCase(ch);
				  }
				  else if(Character.isUpperCase(ch))
				  {
					  ch=Character.toLowerCase(ch);
				  }
			    
			  }
			  word=word+ch;
		  }
		 
			// System.out.println(word);
	  }
	  for(int x=0;x<a.length;x++)
	  {
		  System.out.println(a[x]);
	  }
	  

	}

}

