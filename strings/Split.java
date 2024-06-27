package com.basicprograms.strings;

import java.util.Arrays;

public class Split
{

	public static void main(String[] args) 
	{
        String s="Hello all Good Morning";
        String a[]=s.split(" ");
        String s2="";
        String s3="";
        String s4="";
        String s5="";
        for(int x=0;x<a.length;x++)
        {
        	String word=a[x];
        	System.out.println(word);
        	StringBuffer sb=new StringBuffer(word);
        	sb.reverse();
        	s2=s2+sb;
        	s2=s2+"  ";
        }
        System.out.println(s2);
        System.out.println("_________________");
        for(int x=a.length-1;x>=0;x--)
        {
        	String word=a[x];
        	System.out.println(word);
        	StringBuffer sb=new StringBuffer(word);
        	sb.reverse();
        	s3=s3+sb;
        	s3=s3+"  ";
        } 
        System.out.println(s3);
        System.out.println("_____________________");
        for(int x=0;x<a.length;x++)
        {
        	String word=a[x];
        	if(x%2==0)
        	{
        		s4=s4+word;
        		
        	}
        	else
        	{
        		StringBuffer sb=new StringBuffer(word);
        		sb.reverse();
        		s4=s4+sb;
        	}
        	s4=s4+"  ";
        }
        System.out.println(s4);
        System.out.println("___________________");
        for(int x=0;x<a.length;x++)
        {
        	String word=a[x];
            char c[]=word.toCharArray();
            Arrays.sort(c);
            String s6=new String(c);
            System.out.print(s6+"  ");
        }
      
	}

}
