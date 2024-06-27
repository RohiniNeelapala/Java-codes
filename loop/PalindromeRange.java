package com.basicprograms.loop;

public class PalindromeRange 
{

	public static void main(String[] args) 
	{
	    for(int x=1;x<=500;x++)
	    {
	    	int reverse=0;
	    	for(int num=x;num>0;num=num/10)
	    	{
		        int remainder=num%10;
		        reverse=reverse*10+remainder;
		    
	    	}
	    	if(reverse==x)
	    	{
	    		System.out.println(x+" is palindrome");
	    	}
	    }

	}

}
